package lektion3.e3_2;

public class Person {
    private final String name;
    private final int age;

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
