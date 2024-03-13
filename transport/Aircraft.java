package task_02;

public class Aircraft extends Vehicle implements Flyable {
    protected int maxAltitude;
    protected boolean isFlying;

    public Aircraft(int id, String brand, String model, int year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель самолета запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель самолета остановлен.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Самолет ускоряется.");
    }

    @Override
    public void brake() {
        System.out.println("Самолет тормозит.");
    }

    @Override
    public void takeOff() {
        System.out.println("Самолет взлетает.");
    }

    @Override
    public void land() {
        System.out.println("Самолет приземляется.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Самолет: " + super.brand + " " + super.model + " " + super.year);
        System.out.println("Максимальная высота полета: " + maxAltitude + " м.");
    }
}