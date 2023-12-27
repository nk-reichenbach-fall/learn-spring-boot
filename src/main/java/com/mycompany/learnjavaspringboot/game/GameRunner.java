package com.mycompany.learnjavaspringboot.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class GameRunner {

    private GamingConsole game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
