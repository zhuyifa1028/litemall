package com.example.cabinet.database.repository.user;

import com.example.cabinet.database.entity.user.WisUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户信息表 Repository
 *
 * @author zhuyifa
 */
public interface WisUserInfoRepository extends JpaRepository<WisUserInfo, String> {

}
