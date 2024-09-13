// Интерфейс Movable с методами для изменения положения точки
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// Класс Point с приватными полями x и y для координат точки
class Point implements Movable {
    private int x;
    private int y;

    // Конструктор для класса Point
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Методы для получения значений полей
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Методы для установки значений полей
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Реализация методов интерфейса Movable
    @Override
    public void moveUp() {
        y -= 1;
    }

    @Override
    public void moveDown() {
        y += 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
    }

    @Override
    public void moveRight() {
        x += 1;
    }

    // Метод для вывода текущих координат точки
    public void printPoint() {
        System.out.println("Current point: (" + x + ", " + y + ")");
    }
}
