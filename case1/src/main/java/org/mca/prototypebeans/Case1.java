package org.mca.prototypebeans;

import org.mca.prototypebeans.config.RootConfig;
import org.mca.prototypebeans.service.DefaultService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Objects;

@Import(RootConfig.class)
public class Case1 {

    public static final String EXPECTED = "b2#b2";

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Case1.class);
        DefaultService bean = (DefaultService) ctx.getBean("bean");
        String value = bean.getValue();
        System.out.println(Objects.equals(value, EXPECTED) ? "expected result" : "not expected result: " + value);
    }

}
