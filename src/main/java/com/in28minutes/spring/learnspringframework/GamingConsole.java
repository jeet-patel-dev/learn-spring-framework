package com.in28minutes.spring.learnspringframework;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {
    void up();

    void down();

    void left();

    void right();
}
