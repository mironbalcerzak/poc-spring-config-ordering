package org.mca.prototypebeans.config.b;

import org.mca.prototypebeans.service.DefaultService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class BConfig {

    @Configuration
    @Order(12)
    static class B1 {

        @Bean("bean")
        public DefaultService b1() {
            return new DefaultService("@Order(10) -> @Order(12) = B1#b1");
        }
    }

    @Configuration
    @Order(11)
    static class B2 {

        @Bean("bean")
        public DefaultService b2() {
            return new DefaultService("@Order(10) -> @Order(11) = B2#b2");
        }
    }

}
