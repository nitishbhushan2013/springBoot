package com.nitish.teach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.nitish.teach.controller.HomeController;

/**
 * Hello world!
 *
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@ComponentScan(basePackageClasses = HomeController.class)
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("inside the spring boot application");
        SpringApplication.run(App.class, args);
    }
}
