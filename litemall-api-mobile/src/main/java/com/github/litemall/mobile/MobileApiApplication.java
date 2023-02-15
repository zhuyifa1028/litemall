package com.github.litemall.mobile;

import com.github.litemall.common.constant.SystemConstant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({SystemConstant.PACKAGE})
@ComponentScan({SystemConstant.PACKAGE})
@EnableJpaRepositories({SystemConstant.PACKAGE})
public class MobileApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileApiApplication.class, args);
    }

}
