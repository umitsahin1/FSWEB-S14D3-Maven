package org.example;


import org.example.company.Car;
import org.example.company.Ford;

public class Main {
    public static void main(String[] args) {
        Car ford = new Ford(3, "ford focus");
        ((Ford)ford).accelerate();
        System.out.println(((Ford)ford).accelerate());

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());
}}

