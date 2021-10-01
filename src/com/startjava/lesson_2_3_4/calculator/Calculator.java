package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private char operation;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        double result = 0;
        if (number1 > 0 && number2 > 0) {
            switch (operation) {
                case '+': 
                    result = number1 + number2;
                    break;
                case '-': 
                    result = number1 - number2;
                    break;
                case '*': 
                    result = number1 * number2;
                    break;
                case '/': 
                    result = (double) number1 / number2;
                    break;
                case '^': 
                    result = 1;
                    for (int i = 0; i < number2; i++) {
                        result *= number1;
                    }
                    break;
                case '%': 
                    result = number1 % number2;
                    break;
                default: System.out.println("Недопустимая операция");
            }
        } else {
            System.out.println("Числа должны быть положительными");
        }
        System.out.println("Результат операции: " + number1 + operation + number2 + " = " + result);
    }
}