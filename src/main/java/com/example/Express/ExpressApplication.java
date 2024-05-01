package com.example.Express;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages= {"com.example.Express.controllers"})
public class ExpressApplication {
	
	
	
	public static void main (String args[]) {
		SpringApplication.run(ExpressApplication.class, args);
		System.out.println("Hello");
		
	}
	
}
