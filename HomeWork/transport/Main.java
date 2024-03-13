package task_02;

public class Main {
    public static void main(String[] args) {
        // Создание объектов различных транспортных средств
        Car car = new Car(1, "Toyota", "Camry", 2022, 60, 30);
        Aircraft aircraft = new Aircraft(2, "Boeing", "747", 2005, 40000);
        Boat boat = new Boat(3, "Bayliner", "175", 2010, 50, 25);

        // Продемонстрируем работу транспортных средств
        System.out.println("=== Работа с автомобилем ===");
        car.startEngine();
        car.accelerate(60);
        car.brake();
        car.refuel(10);
        car.displayInfo();

        System.out.println("=== Работа с самолетом ===");
        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.land();
        aircraft.stopEngine();
        aircraft.displayInfo();

        System.out.println("=== Работа с лодкой ===");
        boat.startEngine();
        boat.startSwimming();
        boat.stopSwimming();
        boat.stopEngine();
        boat.displayInfo();
    }
}