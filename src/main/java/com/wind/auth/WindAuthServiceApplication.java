package com.wind.auth;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
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
//@ImportResource(locations = { "classpath*:spring/applicationContext-provider.xml"})
@SpringBootApplication
@DubboComponentScan(basePackages = "com.wind.auth.service.impl")
public class WindAuthServiceApplication {
	public static void main(String[] args) {
//		try {
			SpringApplication.run(WindAuthServiceApplication.class, args);
//			synchronized (WindAuthServiceApplication.class) {
//				while (true) {
//					WindAuthServiceApplication.class.wait();
//				}
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("******************************* stop ");
//		}
	}
}
