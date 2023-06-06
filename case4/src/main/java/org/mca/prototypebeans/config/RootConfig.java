package org.mca.prototypebeans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class RootConfig {

    @Configuration
    @ComponentScan("org.mca.prototypebeans.config.a")
    @Order(20)
    static class EnableAConfig {

    }

    @Configuration
    @ComponentScan("org.mca.prototypebeans.config.b")
    @Order(10)
    static class EnableBConfig {

    }

}
