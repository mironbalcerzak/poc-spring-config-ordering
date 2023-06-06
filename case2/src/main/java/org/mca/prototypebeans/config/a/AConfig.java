package org.mca.prototypebeans.config.a;

import org.mca.prototypebeans.service.DefaultService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfig {

    @Configuration
    static class A1 {

        @Bean("bean")
        public DefaultService a1() {
            return new DefaultService("A1#a1");
        }
    }

    @Configuration
    static class A2 {

        @Bean("bean")
        public DefaultService a2() {
            return new DefaultService("A2#a2");

        }
    }


}
