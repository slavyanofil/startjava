package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();
        Jaeger jaegerThree = new Jaeger("Striker Eureka", "Mark-5", "Australia", 10);
        jaegerOne.setModelName("Cherno Alpha");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setOrigin("Russia");
        jaegerOne.setStrength(10);
        jaegerTwo.setModelName("Coyote Tango");
        jaegerTwo.setMark("Mark-1");
        jaegerTwo.setOrigin("Japan");
        jaegerTwo.setStrength(7);
        System.out.println("modelName = " + jaegerOne.getModelName());
        System.out.println("modelName = " + jaegerTwo.getModelName());
        System.out.println("modelName = " + jaegerThree.getModelName());
    }
}