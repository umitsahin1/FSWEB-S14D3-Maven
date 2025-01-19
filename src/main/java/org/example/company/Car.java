package org.example.company;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    // Constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    // toString Method
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    // Equals Method
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && name.equals(car.name);
    }


    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }



    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }



}





