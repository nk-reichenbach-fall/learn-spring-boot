package com.mycompany.learnjavaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mycompany.learnjavaspringboot.game.GameRunner;

@SpringBootApplication
public class LearnJavaSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJavaSpringbootApplication.class, args);
		// ConfigurableApplicationContext context = SpringApplication.run(LearnJavaSpringbootApplication.class, args);
		// GameRunner runner = context.getBean(GameRunner.class);
		// runner.run();
	}	

}
