    // Интерфейс Printable с методом print()
    interface Printable {
        void print();
    }

    // Класс Student с полями для хранения имени, номера зачетной книжки и среднего балла
    class Student implements Printable {
        private String name;
        private String id;
        private double gpa;

        // Конструктор для класса Student
        public Student(String name, String id, double gpa) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        }

        // Методы для получения и установки полей
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        // Реализация метода print() из интерфейса Printable
        @Override
        public void print() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("GPA: " + gpa);
        }
    }

