package com.example.firstSpring.runner;

import com.example.firstSpring.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
@ComponentScan("com.example.firstSpring")
@Component
public class Calculate {
	@Autowired
	@Qualifier("mult")
	private Operation ops;

	public void execute(long op1,long op2){
		System.out.println("The result of"+op1+ops.getOpsName()+op2+"is"+ops.operate(op1,op2));

	}

}
