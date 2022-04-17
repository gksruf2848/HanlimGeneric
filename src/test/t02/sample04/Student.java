package test.t02.sample04;

public class Student extends Person {

    public Student(String name) { super(name); }

    public String toString() {
        return String.format("[Person : %s]", super.getName());
    }
}
