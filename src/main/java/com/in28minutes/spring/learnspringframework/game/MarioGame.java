package com.in28minutes.spring.learnspringframework.game;

import com.in28minutes.spring.learnspringframework.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("jump");
    }

    public void down() {
        System.out.println("down into the hole");
    }

    public void left() {
        System.out.println("stop");
    }

    public void right() {
        System.out.println("accelerate");
    }


}
