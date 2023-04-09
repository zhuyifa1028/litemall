package com.github.litemall.manage.service.system.impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.github.litemall.common.entity.system.SystemUser;
import com.github.litemall.common.quartz.BizAssert;
import com.github.litemall.common.repository.system.SystemUserRepository;
import com.github.litemall.manage.domain.converter.system.SystemUserConverter;
import com.github.litemall.manage.domain.vo.system.SystemUserSaveVo;
import com.github.litemall.manage.service.system.SystemUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class SystemUserServiceImpl implements SystemUserService {

    @Resource
    private SystemUserConverter systemUserConverter;

    @Resource
    private SystemUserRepository systemUserRepository;


    @Override
    public void saveSystemUser(SystemUserSaveVo saveVO) {
        SystemUser systemUser = systemUserRepository.findByUsername(saveVO.getUsername());
        BizAssert.isNull(systemUser, "用户名已存在");

        SystemUser entity = systemUserConverter.toSystemUser(saveVO);
        entity.setPassword(DigestUtil.md5Hex(saveVO.getPassword()));
        systemUserRepository.save(entity);
    }

}
