package org.mca.prototypebeans.config.a;

import org.mca.prototypebeans.service.DefaultService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AConfig {

    @Configuration
    @Order(22)
    static class A1 {

        @Bean("bean")
        public DefaultService a1() {
            return new DefaultService("@Order(20) -> @Order(22) = A1#a1");
        }
    }

    @Configuration
    @Order(21)
    static class A2 {

        @Bean("bean")
        public DefaultService a2() {
            return new DefaultService("@Order(20) -> @Order(21) = A2#a2");

        }
    }


}
