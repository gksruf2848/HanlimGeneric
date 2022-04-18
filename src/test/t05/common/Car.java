package test.t05.common;

public class Car {

    private String name;

    public Car(String name) { this.name = name; }

    public String getName() { return this.name; }

    public String toString() {
        return String.format("[Car:%s]", this.name);
    }
}
