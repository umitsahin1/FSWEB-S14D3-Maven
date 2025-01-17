package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLiter, int batterySize, int cylinders) {
        this.avgKmPerLiter =avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Hybrid car engine is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Hybrid car is driving");
        super.drive();
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLitre(double avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
