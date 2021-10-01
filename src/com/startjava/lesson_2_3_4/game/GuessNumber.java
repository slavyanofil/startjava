package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private int turn;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        resetGame();
        targetNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Компьютер загадал число [0; 100]. Подсказка: 11 + Х = " + (targetNumber + 11));
        while ((isAttemptAvailable(p1) || isAttemptAvailable(p2)) && !isGuessed()) {
            currentPlayer = (currentPlayer == p1) ? p2 : p1;
        }
    }
    
    private boolean isGuessed() {
        turn++;
        System.out.println("Ход # " + turn);
        System.out.print(currentPlayer.getName() + ", введите Ваше число: ");
        currentPlayer.setNumber(scanner.nextInt(), currentPlayer.getAttempt());
        currentPlayer.nextAttempt();
        return isPlayerRight(currentPlayer);
    }

    private boolean isAttemptAvailable(Player p) {
        if (p.getAttempt() < p.getAllNumbers().length) {
            return true;
        }
        System.out.println("У игрока " + p.getName() + " закончились попытки.");
        return false;
    }

    private boolean isPlayerRight(Player p) {
        if (p.getNumber() == targetNumber) {
            System.out.println("Игрок " + p.getName() + " угадал число " + targetNumber + " с " + p.getAttempt() + " попытки.");
            System.out.println("Поздравляю, " + p.getName() + "! Вы победили!\n");
            return true;
        } else if (p.getNumber() < targetNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер\n");
        } else if (p.getNumber() > targetNumber) {
            System.out.println("Данное число больше того, что загадал компьютер\n");
        }
        return false;
    }

    private void resetGame() {
        turn = 0;
        currentPlayer = p1;
        Arrays.fill(p1.getAllNumbers(),0,p2.getAttempt(),0);
        Arrays.fill(p2.getAllNumbers(),0,p2.getAttempt(),0);
        p1.setAttempt(0);
        p2.setAttempt(0);
    }
}