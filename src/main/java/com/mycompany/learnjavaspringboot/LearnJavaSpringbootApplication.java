package com.mycompany.learnjavaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mycompany.learnjavaspringboot.game.GameRunner;
import com.mycompany.learnjavaspringboot.game.MarioGame;

@SpringBootApplication
public class LearnJavaSpringbootApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnJavaSpringbootApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);

		runner.run();
	}

}
