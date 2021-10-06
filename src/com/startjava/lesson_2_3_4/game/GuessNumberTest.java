package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Игра 'Угадай число' запущена");
        System.out.print("Укажите лимит попыток каждого игрока: ");
        int countAttempts = scanner.nextInt();
        scanner.nextLine();
        GuessNumber game = new GuessNumber(createPlayer(1, countAttempts), createPlayer(2, countAttempts), countAttempts);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }

    private static Player createPlayer(int i, int countAttempts) {
        System.out.print("Введите имя игрока " + i + " : ");
        return new Player(scanner.nextLine(), countAttempts);
    }
}