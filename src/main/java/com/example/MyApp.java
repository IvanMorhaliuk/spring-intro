package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        MessageService messageService = applicationContext.getBean("messageService2", MessageService.class);
//
//        System.out.println(messageService.getMessage());
//
//
//        applicationContext.close();

        //ZADANIE 2

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(messageServiceConfig.class);

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);


        System.out.println(messageService.getMessage());



    }
}
