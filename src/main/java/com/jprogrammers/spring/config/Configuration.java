package com.jprogrammers.spring.config;

import com.jprogrammers.spring.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by alireza on 9/19/15.
 */
@org.springframework.context.annotation.Configuration
@PropertySource("classpath:app.properties")
public class Configuration {

    @Autowired
    Environment env;

    @Bean
    public SimpleBean myBean(){

        SimpleBean simpleBean = new SimpleBean();
        simpleBean.setName(env.getProperty("simplebean.name"));

        return simpleBean;
    }
}
