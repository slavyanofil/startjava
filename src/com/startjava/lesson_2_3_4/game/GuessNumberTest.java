package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра 'Угадай число' запущена");
        System.out.print("Укажите лимит попыток каждого игрока: ");
        int attemptsLimit = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player p1 = new Player(name1, attemptsLimit);
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player p2 = new Player(name2, attemptsLimit);
        GuessNumber game = new GuessNumber(p1, p2, attemptsLimit);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }
}