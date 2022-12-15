package com.example.cabinet.database.entity;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础 Entity
 *
 * @author zhuyifa
 */
@Data
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public class BaseEntity<ID extends Serializable> implements Persistable<ID> {

    @GenericGenerator(name = "snowflakeId", strategy = "com.example.cabinet.database.entity.IdentifierGeneratorImpl")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "snowflakeId")
    @Id
    private ID id;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @Override
    public boolean isNew() {
        return ObjectUtil.isNull(id);
    }

}
