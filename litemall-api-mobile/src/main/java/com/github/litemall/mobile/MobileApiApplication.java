package com.github.litemall.mobile;

import com.github.litemall.common.constants.PackageConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({PackageConstants.COMMON, PackageConstants.MOBILE})
@EntityScan({PackageConstants.COMMON})
@EnableJpaRepositories({PackageConstants.COMMON})
public class MobileApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileApiApplication.class, args);
    }

}
