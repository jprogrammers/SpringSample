package com.jprogrammers.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 9/17/2015.
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        SimpleBean simpleBean = (SimpleBean) context.getBean("myBean");

        System.out.println(simpleBean.getName());
    }
}
