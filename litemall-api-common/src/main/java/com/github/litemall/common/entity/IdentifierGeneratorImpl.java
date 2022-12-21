package com.github.litemall.common.entity;

import cn.hutool.core.util.IdUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class IdentifierGeneratorImpl implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return IdUtil.getSnowflakeNextIdStr();
    }

}
