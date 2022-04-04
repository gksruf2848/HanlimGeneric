package test.t04.sample04;

public class Course<T> {

    private String name;
    private T[] students;

    @SuppressWarnings("unchecked")
    public Course(String name, int cnt) {
        this.name = name;
        this.students = (T[])new Object[cnt];
    }

    public String getName() { return this.name; }
    public T[] getStudents() { return this.students; }

    public void add(T t) {
        for(int i = 0; i<this.students.length; i++) {
            if(this.students[i] == null) {
                this.students[i] = t;
                break;
            }
        }
    }
}
