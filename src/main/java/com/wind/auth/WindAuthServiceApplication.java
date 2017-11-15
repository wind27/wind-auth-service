package com.wind.auth;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.wind.common.DataSourceEnvironment;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.context.annotation.Import;

@Import({ DispatcherServletAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.class,
        ErrorMvcAutoConfiguration.class, HttpEncodingAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class, JacksonAutoConfiguration.class, MultipartAutoConfiguration.class,
        ServerPropertiesAutoConfiguration.class, WebMvcAutoConfiguration.class })
@SpringBootApplication
@MapperScan("com.wind.auth.mapper")
@EnableAutoConfiguration
@DubboComponentScan(basePackages = "com.wind.auth.service.impl")
public class WindAuthServiceApplication {


    public static void main(String[] args) {


        SpringApplication.run(WindAuthServiceApplication.class, args);

        System.out.println(DataSourceEnvironment.AUTH);
    }
}
