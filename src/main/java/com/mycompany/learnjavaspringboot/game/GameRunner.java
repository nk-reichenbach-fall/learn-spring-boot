package com.mycompany.learnjavaspringboot.game;

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
