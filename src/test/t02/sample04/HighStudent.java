package test.t02.sample04;

public class HighStudent extends Student {

    public HighStudent(String name) { super(name); }

    public String toString() {
        return String.format("[HighStudent : %s]", super.getName());
    }
}
