package com.example.cabinet.database.entity;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * 审计功能抽象类
 *
 * @author zhuyifa
 */
@Data
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public abstract class JpaEntity<ID extends Serializable> implements Persistable<ID> {

    @Id
    private ID id;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private Date createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private Date lastModifiedDate;

    @Transient
    @Override
    public boolean isNew() {
        return ObjectUtil.isNull(id);
    }

}
