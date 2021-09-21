import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner s = new Scanner(System.in);
        start(calculator, s);
        String answer = s.nextLine();
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                start(calculator, s);
            } else {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            }
            answer = s.nextLine();
        }
    }

    private static void start(Calculator calc, Scanner s) {
        System.out.println();
        System.out.print("Введите первое число: ");
        calc.setNumber1(s.nextInt());
        System.out.print("Введите знак математической операции: [+, -, *, /, ^, %]: ");
        calc.setOperation(s.next().charAt(0));
        System.out.print("Введите второе число: ");
        calc.setNumber2(s.nextInt());
        calc.getResult();
    }
}