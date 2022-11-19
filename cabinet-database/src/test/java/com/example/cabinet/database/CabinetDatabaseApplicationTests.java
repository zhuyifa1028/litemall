package com.example.cabinet.database;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import org.junit.jupiter.api.Test;

class CabinetDatabaseApplicationTests {

    @Test
    void contextLoads() {
        AutoGenerator generator = new AutoGenerator(dataSourceConfig());
        generator.global(globalConfig());
        generator.packageInfo(packageConfig());
        generator.execute();
    }

    /**
     * 数据源配置
     */
    private DataSourceConfig dataSourceConfig() {
        return new DataSourceConfig.Builder("jdbc:mysql://127.0.0.1:3306/cabinet", "root", "123456")
                .schema("cabinet")
                .build();
    }

    /**
     * 全局配置
     */
    private GlobalConfig globalConfig() {
        return new GlobalConfig.Builder()
                .outputDir("/Users/Admin/IdeaProjects/cabinet/generator")
                .author("zhuyifa")
                .enableKotlin()
                .enableSwagger()
                .build();
    }

    /**
     * 包配置
     */
    private PackageConfig packageConfig() {
        return new PackageConfig.Builder()
                .parent("com.example.cabinet.database")
                .moduleName("")
                .xml("mapper.impl")
                .build();
    }

}
