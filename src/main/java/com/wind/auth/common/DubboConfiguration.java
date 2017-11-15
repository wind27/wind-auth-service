package com.wind.auth.common;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangying
 * @date 2017/11/15.
 */
@Configuration
public class DubboConfiguration {

    @Value("${dubbo.registry.address}")
    private String zkRegisterAddress;
    @Value("${dubbo.user.version}")
    private String dubboVersion;
    @Value("${dubbo.protocol}")
    private String dubboProtocol;
    @Value("${dubbo.protocol.port}")
    private int dubboPort;
    @Value("${dubbo.timeout}")
    private int dubboTimeout;

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-test");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(zkRegisterAddress);
        registryConfig.setVersion(dubboVersion);
        registryConfig.setPort(dubboPort);
        registryConfig.setProtocol(dubboProtocol);
        registryConfig.setTimeout(dubboTimeout);
        return registryConfig;
    }
}
