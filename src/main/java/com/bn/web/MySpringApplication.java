package com.bn.web;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* Try pushing..
 * This class initiates Spring Boot Framework..
 * Test1 senthilganeshk
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class MySpringApplication {

	private static final Logger logger = LoggerFactory.getLogger(MySpringApplication.class);
    public static void main(String[] args) {
    	ApplicationContext ctx = SpringApplication.run(MySpringApplication.class, args);
        
        
        String beanNames[] = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        
        for (String beanName: beanNames)
        	logger.info(beanName);
    }
} //Bug fix on master..

//This is first commit to 1.0..