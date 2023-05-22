package io.github.zkllll23.mynovel.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * 跨域配置属性
 *
 * @author zkllll23
 * @date 2023/5/22
 */
@ConfigurationProperties(prefix = "my-novel.cors")
@Data
public class CorsProperties {
    /**
     * 允许跨域的域名
     */
    private List<String> allowOrigins;
}
