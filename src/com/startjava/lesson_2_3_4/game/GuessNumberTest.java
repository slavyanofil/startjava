package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static int countAttempts;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Игра 'Угадай число' запущена");
        System.out.print("Укажите лимит попыток каждого игрока: ");
        countAttempts = scanner.nextInt();
        scanner.nextLine();
        GuessNumber game = new GuessNumber(setPlayer(new Player(1)), setPlayer(new Player(2)), countAttempts);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }

    private static Player setPlayer(Player p) {
        System.out.print("Введите имя игрока " + p.getPlayerNumber() + " : ");
        p = new Player(scanner.nextLine(), countAttempts);
        return p;
    }
}