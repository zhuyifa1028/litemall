package com.github.litemall.common.repository.system;

import com.github.litemall.common.entity.system.SystemUser;
import com.github.litemall.common.repository.BaseRepository;

/**
 * 系统用户表Repository
 *
 * @author zhuyifa
 */
public interface SystemUserRepository extends BaseRepository<SystemUser> {

    SystemUser findByUsername(String username);

}
