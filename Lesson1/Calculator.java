public class Calculator {   
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 2;
        char operation = '^';
        int result;
        if (number1 > 0 & number2 > 0) {
            switch (operation) {
                case '+': 
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;
                case '-': 
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;
                case '*': 
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;
                case '/': 
                    float div = (float) number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + div);
                    break;
                case '^': 
                    result = 1;
                    System.out.print(number1 + " ^ " + number2 +" = ");
                    for (int i = 0; i < number2; i++) {
                        result *= number1;
                    }
                    System.out.println(result);
                    break;
                case '%': 
                    result = number1 % number2;
                    System.out.println(number1 + " % " + number2 + " = " + result);
                    break;
                default: System.out.println("Недопустимая операция");
            }
        } else {
            System.out.println("Числа должны быть положительными");
        }
    }
}