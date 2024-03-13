package task_02;

public class Boat extends Vehicle implements Swimmable {
    protected int maxSpeed;
    protected boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed, int currentSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель лодки запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель лодки остановлен.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Лодка ускоряется.");
    }

    @Override
    public void brake() {
        System.out.println("Лодка тормозит.");
    }

    @Override
    public void startSwimming() {
        System.out.println("Лодка начинает движение по воде.");
    }

    @Override
    public void stopSwimming() {
        System.out.println("Лодка прекращает движение по воде.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Лодка: " + super.brand + " " + super.model + " " + super.year);
        System.out.println("Максимальная скорость на воде: " + maxSpeed + " км/ч.");
    }
}