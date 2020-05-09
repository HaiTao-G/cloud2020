package com.haitao.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0.0
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Author Tao
 * @Date 2020/5/9 14:38
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
