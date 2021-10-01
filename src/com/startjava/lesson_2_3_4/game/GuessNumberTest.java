package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("У каждого игрока по 10 попыток");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player p1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player p2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(p1, p2);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            showPlayerNumbers(p1);
            showPlayerNumbers(p2);
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }

    private static void showPlayerNumbers(Player p) {
        System.out.println("Числа игрока " + p.getName() + " : " + Arrays.toString(Arrays.copyOf(p.getAllNumbers(), p.getAttempt())));
    }
}