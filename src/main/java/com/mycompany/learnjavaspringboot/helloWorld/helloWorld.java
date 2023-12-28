package com.mycompany.learnjavaspringboot.helloWorld;

public class helloWorld {

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public helloWorld(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "helloWorld [string=" + string + "]";
    }

}
