package test.t03.common;

public class Dog {

    private String name;

    public Dog() { }

    public Dog(String name) { this.name = name; }

    public String getName() { return this.name; }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[Dog : ");
        sb.append(this.name);
        sb.append("]");

        return sb.toString();
    }
}
