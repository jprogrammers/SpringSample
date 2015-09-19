package com.jprogrammers.spring;

import com.jprogrammers.spring.config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by alireza on 9/19/15.
 */
public class ConfigurationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(Configuration.class);
        ctx.refresh();
        SimpleBean myBean = (SimpleBean) ctx.getBean("myBean");

        System.out.println(myBean.getName());

    }
}
