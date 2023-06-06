package org.mca.prototypebeans.config.b;

import org.mca.prototypebeans.service.DefaultService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConfig {

    @Bean("bean")
    public DefaultService b1() {
        return new DefaultService("b1");
    }

}
