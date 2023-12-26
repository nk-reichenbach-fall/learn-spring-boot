package com.mycompany.learnjavaspringboot.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario Up");
    }

    public void down() {
        System.out.println("Mario Down");
    }

    public void left() {
        System.out.println("Mario Left");
    }

    public void right() {
        System.out.println("Mario Right");
    }
}
