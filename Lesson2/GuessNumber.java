import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private int turn = 1;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        takeFirstTurn();
        while (currentPlayer.getNumber() != targetNumber) {
            if (currentPlayer.getNumber() < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                System.out.println();
            } else if (currentPlayer.getNumber() > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                System.out.println();
            }
            if (currentPlayer == p1) {
                currentPlayer = p2;
            } else {
                currentPlayer = p1;
            }
            takeNextTurn();
        }
        System.out.println("Поздравляю, " + currentPlayer.getName() + "! Вы победили!");
    }

    private void takeFirstTurn() {
        turn = 1;
        targetNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Компьютер загадал число [0; 100]. Подсказка: 11 + Х = " + (targetNumber + 11));
        currentPlayer = p1;
        System.out.println("Ход # 1");
        System.out.print(currentPlayer.getName() +", введите Ваше число: ");
        currentPlayer.setNumber(scanner.nextInt());
        System.out.println();
    }

    private void takeNextTurn() {
        System.out.println("Ход # " + turn);
        System.out.print(currentPlayer.getName() +", введите Ваше число: ");
        currentPlayer.setNumber(scanner.nextInt());
        System.out.println();
        turn++;
    }
}