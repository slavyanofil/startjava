package com.startjava.lesson_1.unicode;

public class Unicode {   
    public static void main(String[] args) {
        //Вывод на экран символов Unicode в диапазоне [33, 126]
        for (int i = 33; i <= 126; i++) {
            System.out.println((char) i);
        }
    }
}