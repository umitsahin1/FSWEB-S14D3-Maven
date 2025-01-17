package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(double averageKmPerLiter, int cylinders) {
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Gas powered car engine is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Gas powered car is driving");
        super.drive();
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public void setAvgKmPerLitre(double averageKmPerLiter) {
        this.averageKmPerLiter = averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
