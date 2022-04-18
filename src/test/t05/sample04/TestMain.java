package test.t05.sample04;

public class TestMain {

    public static void main(String[] args) {

        Course<Person> coursePerson = new Course("일반인과정");
        coursePerson.add(new Person("일반인1"));
        coursePerson.add(new Worker("직장인1"));
        coursePerson.add(new Student("학생1"));
        coursePerson.add(new HighStudent("고등학생1"));

        Course<Worker> courseWorker = new Course("직장인과정");
        coursePerson.add(new Person("일반인1"));
        coursePerson.add(new Worker("직장인1"));

        Course<Student> courseStudent = new Course("학생과정");
        coursePerson.add(new Student("학생1"));
        coursePerson.add(new HighStudent("고등학생1"));

        Course<Student> courseHighStudent = new Course("고등학생과정");
        coursePerson.add(new Student("학생1"));
        coursePerson.add(new HighStudent("고등학생1"));

    }

}
