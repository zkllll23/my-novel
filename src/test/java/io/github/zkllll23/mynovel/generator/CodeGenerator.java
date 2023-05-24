package io.github.zkllll23.mynovel.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author zkllll23
 * @date 2023/5/23
 */
public class CodeGenerator {

    /**
     * 项目信息
     */
    private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String JAVA_PATH = "/src/main/java";
    private static final String RESOURCE_PATH = "/src/main/resources";
    private static final String BASE_PACKAGE = "io.github.zkllll23.mynovel";

    /**
     * 数据库信息
     */
    private static final String DATABASE_IP = "127.0.0.1";
    private static final String DATABASE_PORT = "3306";
    private static final String DATABASE_NAME = "mynovel";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "123456";

    public static void main(String[] args) {

        Map<String, Object> paramMap = new HashMap<>();

        FastAutoGenerator.create(String.format("jdbc:mysql://%s:%s/%s?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai", DATABASE_IP, DATABASE_PORT, DATABASE_NAME), DATABASE_USERNAME, DATABASE_PASSWORD)
                // 全局配置(GlobalConfig)
                .globalConfig(builder -> {
                    builder.author("zkllll23")
                            .outputDir(PROJECT_PATH + JAVA_PATH)
                            .commentDate("yyyy-MM-dd");
                })
                // 包配置(PackageConfig)
                .packageConfig(builder -> {
                    builder.parent(BASE_PACKAGE)
                            .entity("dao.entity")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("dao.mapper")
                            .controller("controller")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, PROJECT_PATH + RESOURCE_PATH + "/mapper"));
                })
                // 模板配置(TemplateConfig)
                .templateConfig(builder -> {
                    builder.entity("/templates/entity.java")
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .mapper("/templates/mapper.java")
                            .xml("/templates/mapper.xml")
                            .controller("/templates/controller.java")
                            .disable(TemplateType.SERVICE)
                            .disable(TemplateType.SERVICE_IMPL)
                            .disable(TemplateType.CONTROLLER);
                })
                // 注入配置(InjectionConfig)
                .injectionConfig(builder -> {
                    builder.customMap(paramMap);
                })
                // 策略配置(StrategyConfig)
                .strategyConfig(builder -> {
                    builder.entityBuilder()
                            .enableFileOverride()
                            .serviceBuilder()
                            .enableFileOverride()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImp")
                            .mapperBuilder()
                            .enableFileOverride()
                            .controllerBuilder()
                            .enableFileOverride()
                            .enableRestStyle();
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}