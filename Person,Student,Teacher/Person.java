public class Person {

    private String nama;
    private int age;

    public Person() {
        super();
        this.nama = "";
        this.age = 0;
    }

    public Person(String nama, int age) {
        super();
        this.nama = nama;
        this.age = age;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public String toString() {
        return "Person{" +
                "nama='" + nama + '\'' +
                ", age=" + age +
                '}';
    }
}