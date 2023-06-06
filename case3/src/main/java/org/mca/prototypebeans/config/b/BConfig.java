package org.mca.prototypebeans.config.b;

import org.mca.prototypebeans.service.DefaultService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConfig {

    @Configuration
    static class B1 {

        @Bean("bean")
        public DefaultService b1() {
            return new DefaultService("@Order(10) = B1#b1");
        }
    }

    @Configuration
    static class B2 {

        @Bean("bean")
        public DefaultService b2() {
            return new DefaultService("@Order(10) = B2#b2");
        }
    }

}
