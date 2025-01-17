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
        return getClass().getSimpleName() + " the car's engine is starting";

    }


    public String accelerate() {
        return getClass().getSimpleName() + " the car is accelerating";
    }

    public String brake(){
        return getClass().getSimpleName() + " the car is braking";
    }



}





