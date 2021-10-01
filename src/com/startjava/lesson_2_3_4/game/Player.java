package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private int[] allNumbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number, int i) {
        this.number = number;
        allNumbers[i] = number;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int i) {
        attempt = i;
    }

    public void nextAttempt() {
        attempt++;
    }

    public int[] getAllNumbers() {
        return allNumbers;
    }
}