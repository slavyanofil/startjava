import java.util.Scanner;
public class GuessNumber {
        private int targetNumber;
        private Player p1;
        private Player p2;
        private Player p;
        private static int turn = 1;
        private Scanner s;

        public GuessNumber (Player p1, Player p2, Scanner s) {
            this.p1 = p1;
            this.p2 = p2;
            this.s = s;
        }

        public void start() {
            targetNumber = (int) (Math.random() * 100 + 1);
            System.out.println("Компьютер загадал число [0; 100]. Подсказка: 11 + Х = " + (targetNumber + 11));
            turn = 1;
            nextTurn();
            while (p.getNumber() != targetNumber) {
                if (p.getNumber() < targetNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                    System.out.println();
                    nextTurn();
                } else if (p.getNumber() > targetNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                    System.out.println();
                    nextTurn();
                }
            }
            System.out.println("Поздравляю, " + p.getName() + "! Вы победили!");
        }

        private void nextTurn() {
            System.out.println("Ход # " + turn);
            if (turn % 2 != 0) {
                p = p1;
            } else {
                p = p2;
            }
            System.out.print(p.getName() +", введите Ваше число: ");
            p.setNumber(s.nextInt());
            System.out.println();
            turn++;
        }
}