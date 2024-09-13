public class Check {

    // Пример использования класса Book
    public static class Main {
        public static void main(String[] args) {
            Book book = new Book("1984", "George Orwell", 1949);
            Student student = new Student("John Doe", "12345", 3.8);
            Point point = new Point(0, 0);
            Clock clock = new Clock(12, 30, 45);
            Car car = new Car("Toyota", "Corolla", 2020);

            book.display();
            student.print();

            point.printPoint(); // Вывод: Current point: (0, 0)

            point.moveUp();
            point.printPoint(); // Вывод: Current point: (0, -1)

            point.moveRight();
            point.printPoint(); // Вывод: Current point: (1, -1)

            point.moveDown();
            point.printPoint(); // Вывод: Current point: (1, 0)

            point.moveLeft();
            point.printPoint(); // Вывод: Current point: (0, 0)

            clock.ReadTime(); // Вывод: Current time: 12:30:45

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:46

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:47

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:48

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:49

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:50

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:51

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:52

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:53

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:54

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:55

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:56

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:57

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:58

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:30:59

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:31:00

            clock.tick();
            clock.ReadTime(); // Вывод: Current time: 12:31:01

            car.printCarInfo(); // Вывод: Car Info: 2020 Toyota Corolla

            car.start(); // Вывод: Starting the car...
            car.drive(100); // Вывод: Driving 100 miles...
            car.stop(); // Вывод: Stopping the car...

        }
    }
}
