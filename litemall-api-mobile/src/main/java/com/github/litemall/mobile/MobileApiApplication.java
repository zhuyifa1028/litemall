package com.github.litemall.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.github.litemall.mobile", "com.github.litemall.common"})
public class MobileApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileApiApplication.class, args);
    }

}
