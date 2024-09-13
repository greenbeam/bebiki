// Интерфейс Drivable с методами start(), stop() и drive(distance)
interface Drivable {
    void start();
    void stop();
    void drive(int distance);
}

// Класс Car с полями для марки, модели и года выпуска
class Car implements Drivable {
    private String make;
    private String model;
    private int year;

    // Конструктор для класса Car
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Методы для получения значений полей
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Методы для установки значений полей
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Реализация методов интерфейса Drivable
    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car...");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Driving " + distance + " miles...");
    }

    // Метод для вывода информации о машине
    public void printCarInfo() {
        System.out.println("Car Info: " + year + " " + make + " " + model);
    }
}
