package com.github.litemall.common.entity;

import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Properties;

@Slf4j
@Component
public class MyIdentifierGenerator implements IdentifierGenerator {

    private String entityName;

    @Override
    public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
        entityName = params.getProperty(ENTITY_NAME);
        if (Objects.isNull(entityName)) {
            throw new MappingException("no entity name");
        }
    }

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        final Object identifier = session.getEntityPersister(entityName, object).getIdentifier(object, session);
        // 如果填写了主键id，如果数据库中没有这条记录，则新增指定id的记录；否则更新记录
        if (Objects.nonNull(identifier)) {
            log.info("{} [{}] updated.", entityName, identifier);
            return identifier;
        }
        // 如果不填写主键id，则利用数据库本身的自增策略指定id
        String snowflakeNextIdStr = IdUtil.getSnowflakeNextIdStr();
        log.info("{} [{}] created.", entityName, snowflakeNextIdStr);
        return snowflakeNextIdStr;
    }

}
