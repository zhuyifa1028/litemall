package com.github.litemall.common.entity;

import cn.hutool.core.util.IdUtil;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Objects;
import java.util.Properties;

@Component
public class IdentifierGeneratorImpl implements IdentifierGenerator {

    private String entityName;

    @Override
    public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
        entityName = params.getProperty(ENTITY_NAME);
        if (Objects.isNull(entityName)) {
            throw new MappingException("no entity name");
        }
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        final Serializable identifier = session.getEntityPersister(entityName, object).getIdentifier(object, session);
        // 如果填写了主键id，如果数据库中没有这条记录，则新增指定id的记录；否则更新记录
        if (Objects.nonNull(identifier)) {
            return identifier;
        }
        // 如果不填写主键id，则利用数据库本身的自增策略指定id
        return IdUtil.getSnowflakeNextIdStr();
    }

}
