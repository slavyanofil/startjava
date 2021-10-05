package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int playerNumber;
    private int[] allNumbers;
    private int attempt;

    public Player(int number) {
        this.playerNumber = number;
    }

    public Player(String name, int attemptsLimit) {
        this.name = name;
        allNumbers = new int[attemptsLimit];
    }

    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getCurrentNumber(int i) {
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

    public String getAllNumbersToString() {
        String s = "";
        for (int i : Arrays.copyOf(allNumbers, attempt)) {
            s += i + " ";
        }
        return s;
    }
}