public class Calculator {
        private int number1 = 3;
        private int number2 = 2;
        private char operation = '^';

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
            double result;
            if (number1 > 0 && number2 > 0) {
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
                        result = (double) number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
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