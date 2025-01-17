package org.example.company;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": the car's engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": the car is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": the car is braking";
    }
}


