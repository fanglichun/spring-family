package com.flc.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @ClassName AuthenticationApplication
 * @Description
 * @Author fanglichun
 * @Date 2019-11-16 11:10
 * @Version 1.0
 **/

@SpringBootApplication(scanBasePackages = "com.flc.authentication")
@EnableResourceServer
@EnableAuthorizationServer
public class AuthenticationApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationApplication.class);
    }
}
