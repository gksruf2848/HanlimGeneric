package test.t01.common;

public class Car {

    private String name;

    public Car() { };

    public Car(String name) { this.name = name; }

    public String getName() { return this.name; }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[Car : ");
        sb.append(this.name);
        sb.append("]");

        return sb.toString();
    }
}
