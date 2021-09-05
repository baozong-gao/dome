package com.example.gateway.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * swagger的属性配置类
 */

@Data
@ConfigurationProperties("swagger")
public class SwaggerProperties {

    /**
     * 前台接口配置
     */
    private SwaggerEntity front;

    /**
     * 后台接口配置
     */
    private SwaggerEntity back;


    @Data
    public static class SwaggerEntity {
        private String groupName;
        private String basePackage;
        private String title;
        private String description;
        private String contactName;
        private String contactEmail;
        private String contactUrl;
        private String version;
        private Boolean enable;
    }
}
