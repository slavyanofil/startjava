public class Calculator {   
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 2;
        char operation = '^';
        int sum;
        if (number1 > 0 & number2 > 0) {
            switch (operation) {
                case '+': sum = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + sum);
                    break;
                case '-': int sub = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + sub);
                    break;
                case '*': int mult = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + mult);
                    break;
                case '/': float div = (float) number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + div);
                    break;
                case '^': int resultNumber = 1;
                    System.out.print(number1 + " ^ " + number2 +" = ");
                    for (int i = 0; i < number2; i++) {
                        resultNumber *= number1;
                    }
                    System.out.println(resultNumber);
                    break;
                case '%': int mod = number1 % number2;
                    System.out.println(number1 + " % " + number2 + " = " + mod);
                    break;
                default: System.out.println("Недопустимая операция");
            }
        } else {
            System.out.println("Числа должны быть положительными");
        }
    }
}