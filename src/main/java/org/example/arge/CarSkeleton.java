package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {

        System.out.println(name + ": Engine started");
    }

    public void drive() {
        runEngine();
        System.out.println(name + ": Car is driving");
    }

    protected void runEngine() {
        System.out.println(name + ": Running engine");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}




