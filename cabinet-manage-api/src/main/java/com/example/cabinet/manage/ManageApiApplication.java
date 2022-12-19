package com.example.cabinet.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.example.cabinet.manage",
        "com.example.cabinet.database"
})
public class ManageApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApiApplication.class, args);
    }

}
