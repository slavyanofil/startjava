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
            scanner.nextLine();
            answer = scanner.nextLine();
        }
    }

    private static void inputMathExpression(Calculator calc, Scanner s) {
        System.out.println();
        System.out.print("Введите первое число: ");
        calc.setNumber1(s.nextInt());
        System.out.print("Введите знак математической операции: [+, -, *, /, ^, %]: ");
        calc.setOperation(s.next().charAt(0));
        System.out.print("Введите второе число: ");
        calc.setNumber2(s.nextInt());
    }
}