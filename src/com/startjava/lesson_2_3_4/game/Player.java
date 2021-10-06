package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] allNumbers;
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentNumber() {
        return allNumbers[attempt - 1];
    }

    public void setNumber(int number, int i) {
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
        return Arrays.copyOf(allNumbers, attempt);
    }

    public void initAllNumbers(int i) {
        allNumbers = new int[i];
    }

    public void resetAllNumbers() {
        Arrays.fill(allNumbers, 0, getAttempt(), 0);
    }

}