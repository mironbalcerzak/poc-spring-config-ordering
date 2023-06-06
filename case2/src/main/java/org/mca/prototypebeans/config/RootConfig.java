package org.mca.prototypebeans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {

    @Configuration
    @ComponentScan("org.mca.prototypebeans.config.a")
    static class EnableAConfig {

    }

    @Configuration
    @ComponentScan("org.mca.prototypebeans.config.b")
    static class EnableBConfig {

    }

}
