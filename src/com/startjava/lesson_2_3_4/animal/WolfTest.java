package com.startjava.lesson_2_3_4.animal;

public class WolfTest {   
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setMale(true);
        wolf.setName("Akella");
        wolf.setWeight(43.5f);
        wolf.setAge(15);
        wolf.setColour("Light grey");
        System.out.println("Волк самец: " + wolf.getMale());
        System.out.println("Кличка волка: " + wolf.getName());
        System.out.println("Вес волка: " + wolf.getWeight());
        System.out.println("Возраст волка: " + wolf.getAge());
        System.out.println("Окрас: " + wolf.getColour());
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}