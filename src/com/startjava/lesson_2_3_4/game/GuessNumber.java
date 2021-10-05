package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player[] playersList = new Player[2];
    private Player currentPlayer;
    private int attemptsLimit;
    private int turn;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2, int attemptsLimit) {
        playersList[0] = p1;
        playersList[1] = p2;
        this.attemptsLimit = attemptsLimit;
    }

    public void start() {
        init();
        targetNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Компьютер загадал число [0; 100]. Подсказка: 11 + Х = " + (targetNumber + 11));
        while ((isAttemptAvailable()) && !makeMove()) {
            currentPlayer = (currentPlayer == playersList[0]) ? playersList[1] : playersList[0];
        }
        showPlayerNumbers();
    }

    private void init() {
        turn = 0;
        currentPlayer = playersList[0];
        Arrays.fill(playersList[0].getAllNumbers(), 0, playersList[0].getAttempt(), 0);
        Arrays.fill(playersList[1].getAllNumbers(), 0, playersList[1].getAttempt(), 0);
        playersList[0].setAttempt(0);
        playersList[1].setAttempt(0);
    }

    private boolean isAttemptAvailable() {
        for (Player p : playersList) {
            if (p.getAttempt() < attemptsLimit) {
                return true;
            } else {
                System.out.println("У игрока " + p.getName() + " закончились попытки.");
            }
        }
        return false;
    }

    private boolean makeMove() {
        turn++;
        System.out.println("Ход # " + turn);
        System.out.print(currentPlayer.getName() + ", введите Ваше число: ");
        int number = scanner.nextInt();
        int attempt = currentPlayer.getAttempt();
        currentPlayer.setNumber(number, attempt);
        currentPlayer.nextAttempt();
        return isPlayerRight(currentPlayer);
    }

    private boolean isPlayerRight(Player p) {
        String information;
        if (p.getCurrentNumber(p.getAttempt() - 1) == targetNumber) {
            System.out.println("Игрок " + p.getName() + " угадал число " + targetNumber + " с " + p.getAttempt() + " попытки.");
            System.out.println("Поздравляю, " + p.getName() + "! Вы победили!\n");
            return true;
        } else
            information = (p.getCurrentNumber(p.getAttempt() - 1) < targetNumber) ? "меньше" : "больше";
        System.out.println("Данное число " + information + " того, что загадал компьютер.\n");
        return false;
    }

    private void showPlayerNumbers() {
        for (Player p : playersList) {
            System.out.println("Числа игрока " + p.getName() + " : " + p.getAllNumbersToString());
        }
    }
}