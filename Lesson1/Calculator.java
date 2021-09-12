public class Calculator {   
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 2;
        //Операция суммирования
        int sum;
        if (number1 > 0 & number2 > 0) {
            sum = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + sum);
        } else {
            System.out.println("Оба числа должны быть положительными!");
        }

        //Операция вычитания
        if (number1 > 0 & number2 > 0) {
            int sub = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + sub);
        } else {
            System.out.println("Оба числа должны быть положительными!");
        }

        //Операция умножения
        if (number1 > 0 & number2 > 0) {
            int mult = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + mult);
        } else {
            System.out.println("Оба числа должны быть положительными!");
        }

        //Операция деления
        if (number1 > 0 & number2 > 0) {
            float div = (float) number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + div);
        } else {
            System.out.println("Оба числа должны быть положительными!");
        }

        //Операция возведения в степень числа
        if (number1 > 0 & number2 > 0) {
            int power = number1 * number1;
            System.out.println(number1 + " ^2 " + " = " + power);
        } else {
            System.out.println("Оба числа должны быть положительными!");
        }

        //Операция деления без остатка
        if (number1 > 0 & number2 > 0) {
            int mod = number1 % number2;
            System.out.println(number1 + " % " + number2 + " = " + mod);
        } else {
            System.out.println("Оба числа должны быть положительными!");
        }
    }
}