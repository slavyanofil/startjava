import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private int turn;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        turn = 1;
        currentPlayer = p1;
        targetNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Компьютер загадал число [0; 100]. Подсказка: 11 + Х = " + (targetNumber + 11));
        while (currentPlayer.getNumber() != targetNumber) {
            if (currentPlayer.getNumber() < targetNumber && turn != 1) {
                System.out.println("Данное число меньше того, что загадал компьютер\n");
            } else if (currentPlayer.getNumber() > targetNumber && turn != 1) {
                System.out.println("Данное число больше того, что загадал компьютер\n");
            }
            currentPlayer = (currentPlayer == p1) ? p2 : p1;
            makeMove();
        }
        System.out.println("Поздравляю, " + currentPlayer.getName() + "! Вы победили!\n");
    }

    private void makeMove() {
        System.out.println("Ход # " + turn);
        System.out.print(currentPlayer.getName() +", введите Ваше число: ");
        currentPlayer.setNumber(scanner.nextInt());
        System.out.println();
        turn++;
    }
}