package test.t04.sample04;

public class Worker extends Person {

    public Worker(String name) { super(name); }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[Worker : ");
        sb.append(this.getName());
        sb.append("]");

        return sb.toString();
    }
}