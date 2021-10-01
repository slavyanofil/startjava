package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                inputMathExpression(calculator, scanner);
                calculator.calculate();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }

    private static void inputMathExpression(Calculator calc, Scanner s) {
        System.out.print("\nВведите первое число: ");
        calc.setNumber1(s.nextInt());
        System.out.print("Введите знак математической операции: [+, -, *, /, ^, %]: ");
        calc.setOperation(s.next().charAt(0));
        System.out.print("Введите второе число: ");
        calc.setNumber2(s.nextInt());
        s.nextLine();
    }
}