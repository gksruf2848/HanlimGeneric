package test.t02.sample04;

public class Worker extends Person {

    public Worker(String name) { super(name); }

    public String toString() {
        return String.format("[Worker : %s]", super.getName());
    }
}
