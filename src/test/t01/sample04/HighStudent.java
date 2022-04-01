package test.t01.sample04;

public class HighStudent extends Student {

    public HighStudent(String name) { super(name); }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[HighStudent : ");
        sb.append(this.getName());
        sb.append("]");

        return sb.toString();
    }
}
