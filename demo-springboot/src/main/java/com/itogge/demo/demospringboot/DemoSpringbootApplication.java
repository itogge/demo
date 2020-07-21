package com.itogge.demo.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoSpringbootApplication.class, args);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

}
