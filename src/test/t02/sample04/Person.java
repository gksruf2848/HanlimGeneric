package test.t02.sample04;

public class Person {

    private String name;

    public Person(String name) { this.name = name; }

    public String getName() { return this.name; }

    public String toString() {
        return String.format("[Person : %s]", this.name);
    }
}
