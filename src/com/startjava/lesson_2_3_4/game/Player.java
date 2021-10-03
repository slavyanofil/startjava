package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] allNumbers;
    private int attempt;

    public Player(String name, int attemptsLimit) {
        this.name = name;
        allNumbers = new int[attemptsLimit];
    }

    public String getName() {
        return name;
    }

    public int getNumber(int i) {
        return allNumbers[i];
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
        return Arrays.copyOf(allNumbers, allNumbers.length);
    }
}