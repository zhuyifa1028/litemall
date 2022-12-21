package com.github.litemall.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.github.litemall.manage",
        "com.github.litemall.common"
})
public class ManageApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApiApplication.class, args);
    }

}
