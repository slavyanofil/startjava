public class MyFirstGame {   
    public static void main(String[] args) {
        int selectedNumber = 50;
        int targetNumber = (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число [0; 100]. Это: " + targetNumber);
        System.out.println("Вариант игрока: " + selectedNumber);
        while (selectedNumber != targetNumber) {
            System.out.println("Это число " + selectedNumber + " ?");
            if (selectedNumber < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                selectedNumber++;
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
                selectedNumber--;
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}