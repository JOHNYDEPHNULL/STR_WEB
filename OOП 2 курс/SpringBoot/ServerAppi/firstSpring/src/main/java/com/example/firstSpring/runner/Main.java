package com.example.firstSpring;

import com.example.firstSpring.runner.Calculate;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Calculate.class, args);
        Calculate calculate = context.getBean(Calculate.class);
        calculate.execute(10L, 15L);
        context.close();
    }
}
