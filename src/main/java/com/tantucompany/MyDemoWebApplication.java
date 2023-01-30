package com.tantucompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyDemoWebApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyDemoWebApplication.class, args);
    }

}
