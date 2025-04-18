package src.e3_2;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    @Override
    public String toString() {
        return "Der Name lautet: " + getName() + " und ist " + getAge() + " Jahre alt.";
    }
}
