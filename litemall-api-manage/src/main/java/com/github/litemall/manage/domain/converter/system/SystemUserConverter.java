package com.github.litemall.manage.domain.converter.system;

import com.github.litemall.common.entity.system.SystemUser;
import com.github.litemall.manage.domain.vo.system.SystemUserSaveVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * 系统用户表Converter
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SystemUserConverter {

    SystemUser toSystemUser(SystemUserSaveVo item);

}
