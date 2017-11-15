package com.wind.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Import({ DispatcherServletAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.class,
        ErrorMvcAutoConfiguration.class, HttpEncodingAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class, JacksonAutoConfiguration.class, MultipartAutoConfiguration.class,
        ServerPropertiesAutoConfiguration.class, WebMvcAutoConfiguration.class })
@SpringBootApplication
public class WindAuthServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WindAuthServiceApplication.class, args);
    }
}
