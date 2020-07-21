package com.itogge.demo.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoSpringbootApplication.class, args);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

}
