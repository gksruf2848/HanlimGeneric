package test.t01.sample04;

public class Student extends Person {

    public Student(String name) { super(name); }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[Student : ");
        sb.append(this.getName());
        sb.append("]");

        return sb.toString();
    }
}
