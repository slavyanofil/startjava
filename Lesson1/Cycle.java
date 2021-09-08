public class Cycle {   
    public static void main(String[] args) {
        //Вывод чисел от 0 до 20 циклом for
        System.out.print("Вывод чисел [0;20] циклом for: ");
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Вывод чисел от 6 до -6 с шагом 2
        System.out.print("Вывод чисел [6;-6] циклом while c шагом минус 2: ");
        //первое число диапазона
        int j = 6;
        while (j >= -6) {
            System.out.print(j + " ");
            j-=2;
        }
        System.out.println();

        //Вывод суммы нечётных чисел
        //первое число диапазона
        int k = 10;
        int result = 0;
        do{
            if (k%2 != 0) {
                result+=k;
            }
            k++;
        } while (k <= 20);
        System.out.println("Сумма нечётных чисел [10;20] = " + result);
    }
}