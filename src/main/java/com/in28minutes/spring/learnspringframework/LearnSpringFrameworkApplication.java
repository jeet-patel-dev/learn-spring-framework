package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//      MarioGame game = new MarioGame(); //1
//		SuperContraGame game = new SuperContraGame();

//		GammingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game); //2
        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();
    }

}
