package com.jus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author JusChui
 * @ClassName BootSecurityLog.java
 * @Date 2021年12月04日 16:23
 * @Description
 */
@SpringBootApplication
public class BootSecurityLog extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BootSecurityLog.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootSecurityLog.class);
    }
}
