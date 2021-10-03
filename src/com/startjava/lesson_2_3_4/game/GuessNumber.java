package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player p1;
    private Player p2;
    private Player[] playersList = new Player[2];
    private Player currentPlayer;
    private int attemptsLimit;
    private int turn;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2, int attemptsLimit) {
        this.p1 = p1;
        this.p2 = p2;
        playersList[0] = p1;
        playersList[1] = p2;
        this.attemptsLimit = attemptsLimit;
    }

    public void start() {
        init();
        targetNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Компьютер загадал число [0; 100]. Подсказка: 11 + Х = " + (targetNumber + 11));
        while ((isAttemptAvailable()) && !makeMove()) {
            currentPlayer = (currentPlayer == p1) ? p2 : p1;
        }
        showPlayerNumbers();
    }

    private void init() {
        turn = 0;
        currentPlayer = p1;
        Arrays.fill(p1.getAllNumbers(), 0, p2.getAttempt(), 0);
        Arrays.fill(p2.getAllNumbers(), 0, p2.getAttempt(), 0);
        p1.setAttempt(0);
        p2.setAttempt(0);
    }

    private boolean isAttemptAvailable() {
        for (Player p: playersList) {
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
        currentPlayer.setNumber(scanner.nextInt(), currentPlayer.getAttempt());
        currentPlayer.nextAttempt();
        return isPlayerRight(currentPlayer);
    }

    private void showPlayerNumbers() {
        for (Player p : playersList) {
            System.out.println("Числа игрока " + p.getName() + " : " + Arrays.toString(Arrays.copyOf(p.getAllNumbers(), p.getAttempt())));
        }
    }

    private boolean isPlayerRight(Player p) {
        String information;
        if (p.getNumber(p.getAttempt() - 1) == targetNumber) {
            System.out.println("Игрок " + p.getName() + " угадал число " + targetNumber + " с " + p.getAttempt() + " попытки.");
            System.out.println("Поздравляю, " + p.getName() + "! Вы победили!\n");
            return true;
        } else
            information = (p.getNumber(p.getAttempt() - 1) < targetNumber) ? "Данное число меньше того, что загадал компьютер.\n" : "Данное число больше того, что загадал компьютер\n";
        System.out.println(information);
        return false;
    }
}