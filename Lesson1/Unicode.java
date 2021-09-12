public class Unicode {   
    public static void main(String[] args) {
        //Вывод на экран символов Unicode в диапазоне [33, 126]
        for (int i = 33; i <= 126; i++) {
            char symbol = (char) i;
            System.out.println(symbol);
        }
    }
}