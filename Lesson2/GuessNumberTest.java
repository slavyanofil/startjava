import java.util.Scanner;
public class GuessNumberTest {   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player p1 = new Player(s.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player p2 = new Player(s.nextLine());
        GuessNumber game = new GuessNumber(p1, p2, s);
        game.start();

        String answer = s.nextLine();
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            } else {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
            }
            answer = s.nextLine();
        }
    }
}