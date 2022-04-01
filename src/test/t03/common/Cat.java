package test.t03.common;

public class Cat {

    private String name;

    public Cat() { }

    public Cat(String name) { this.name = name; }

    public String getName() { return this.name; }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[Cat : ");
        sb.append(this.name);
        sb.append("]");

        return sb.toString();
    }
}
