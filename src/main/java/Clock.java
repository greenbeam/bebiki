// Интерфейс Readable с методом ReadTime()
interface Readable {
    void ReadTime();
}

// Класс Clock с полями для хранения часов, минут и секунд
class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    // Конструктор для класса Clock
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Методы для получения и установки времени
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // Метод для увеличения времени на одну секунду
    public void tick() {
        seconds += 1;
        if (seconds >= 60) {
            seconds = 0;
            minutes += 1;
            if (minutes >= 60) {
                minutes = 0;
                hours += 1;
                if (hours >= 24) {
                    hours = 0;
                }
            }
        }
    }

    // Реализация метода ReadTime() из интерфейса Readable
    @Override
    public void ReadTime() {
        System.out.println("Current time: " + hours + ":" + minutes + ":" + seconds);
    }
}