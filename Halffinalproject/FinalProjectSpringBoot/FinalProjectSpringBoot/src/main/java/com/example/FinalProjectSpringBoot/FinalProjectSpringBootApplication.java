package com.example.FinalProjectSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//@ComponentScan
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
@ComponentScan(basePackages = "com.example.FinalProjectSpringBoot")
//public class YourApplicationClass {
//    // Main method and other configurations...
//}
public class FinalProjectSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectSpringBootApplication.class, args);
	}

}
