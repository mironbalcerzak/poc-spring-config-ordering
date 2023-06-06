package org.mca.prototypebeans.config.a;

import org.mca.prototypebeans.service.DefaultService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfig {

    @Bean("bean")
    public DefaultService a1() {
        return new DefaultService("a1");
    }


}
