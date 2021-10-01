package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                inputMathExpression(calculator, scanner);
                System.out.println(calculator.calculate());
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }

    private static void inputMathExpression(Calculator calc, Scanner s) {
        System.out.print("\nВведите математическое выражение в формате: a [+, -, /, *, ^, %] b : ");
        String mathExpression = s.nextLine();
        String[] mathExpressionArray = mathExpression.split(" ");
        calc.setNumber1(Integer.parseInt(mathExpressionArray[0]));
        calc.setOperation(mathExpressionArray[1].charAt(0));
        calc.setNumber2(Integer.parseInt(mathExpressionArray[2]));
    }
}