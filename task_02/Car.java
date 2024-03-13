package task_02;

public class Car extends Vehicle {
    private int fuelCapacity;
    private int currentFuelLevel;

    public Car(int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель автомобиля запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель автомобиля остановлен.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Автомобиль ускоряется до " + speed + " км/ч.");
    }

    @Override
    public void brake() {
        System.out.println("Автомобиль останавливается.");
    }

    public void refuel(int liters) {
        currentFuelLevel += liters;
        System.out.println("Автомобиль заправлен на " + liters + " литров топлива.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Автомобиль: " + super.brand + " " + super.model + " " + super.year);
        System.out.println("Текущий уровень топлива: " + currentFuelLevel + " из " + fuelCapacity + " литров.");
    }
}