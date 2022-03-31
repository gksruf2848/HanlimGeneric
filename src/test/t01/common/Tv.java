package test.t01.common;

public class Tv {

    private String name;

    public Tv() { };

    public Tv(String name) { this.name = name; }

    public String getName() { return this.name; }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[TV : ");
        sb.append(this.name);
        sb.append("]");

        return sb.toString();
    }
}
