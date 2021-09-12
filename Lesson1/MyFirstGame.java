public class MyFirstGame {   
    public static void main(String[] args) {
        //Переменная, хранящая вариант ответа игрока
        int guess = 50;
        //Число, которое нужно отгадать
        int targetNumber = (int) (Math.random() * 100);
        //Компьютер загадывает число от 0 до 100
        System.out.println("Компьютер загадал число [0; 100]. Это: " + targetNumber);
        System.out.println("Вариант игрока: " + guess);
        //После каждой неудачной попытки выводим подсказку
        //"Данное число меньше того, что загадал компьютер"
        while (guess != targetNumber) {
            System.out.println("Это число " + guess + " ?");
            if (guess < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                guess++;
            }
            //или "Данное число больше того, что загадал компьютер"
            if (guess > targetNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                guess--;
            }
            //Если число угадано — "Поздравляю, число угадано!"
            if (guess == targetNumber) {
                System.out.println("Поздравляю, число угадано!");
            }
        }
    }
}