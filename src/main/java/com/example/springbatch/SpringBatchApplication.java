package com.example.springbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBatchApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = SpringApplication.run(SpringBatchApplication.class, args);
    }

}
