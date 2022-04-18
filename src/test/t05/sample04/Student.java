package test.t05.sample04;

public class Student extends Person {

    public Student(String name) { super(name); }

    public String toString() {
        return String.format("[Student:%s]", super.getName());
    }

}
