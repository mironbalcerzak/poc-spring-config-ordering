package org.mca.prototypebeans;

import org.mca.prototypebeans.config.RootConfig;
import org.mca.prototypebeans.service.DefaultService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Objects;

@Import(RootConfig.class)
public class Case4 {

    public static final String EXPECTED = "@Order(20) -> @Order(22) = A1#a1";

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Case4.class);
        DefaultService bean = (DefaultService) ctx.getBean("bean");
        String value = bean.getValue();
        System.out.println(Objects.equals(value, EXPECTED) ? "expected result" : "not expected result: " + value);
    }

}
