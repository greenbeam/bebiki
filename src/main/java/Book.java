// Интерфейс Displayable с методом display()
interface Displayable {
    void display();
}

// Класс Book с полями для названия, автора и года издания
class Book implements Displayable {
    private String title;
    private String author;
    private int year;

    // Конструктор для класса Book
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Методы для получения и установки полей
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Реализация метода display() из интерфейса Displayable
    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

}
