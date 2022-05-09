package test.t05.sample04;

public class TestMain {

    public static void main(String[] args) {

        Course<Person> coursePerson = new Course("일반인과정");
        coursePerson.add(new Person("일반인1"));
        coursePerson.add(new Worker("직장인1"));
        coursePerson.add(new Student("학생1"));
        coursePerson.add(new HighStudent("고등학생1"));

        Course<Worker> courseWorker = new Course("직장인과정");
        courseWorker.add(new Worker("직장인1"));

        Course<Student> courseStudent = new Course("학생과정");
        courseStudent.add(new Student("학생1"));
        courseStudent.add(new HighStudent("고등학생1"));

        Course<HighStudent> courseHighStudent = new Course("고등학생과정");
        courseHighStudent.add(new HighStudent("고등학생1"));

        Util.printCourse(coursePerson);
        Util.printCourse(courseWorker);
        Util.printCourse(courseStudent);
        Util.printCourse(courseHighStudent);

        Util.printCourseWorker(coursePerson);
        Util.printCourseWorker(courseWorker);
        //Util.printCourseWorker(courseStudent);
        //Util.printCourseWorker(courseHighStudent);

        //Util.printCourseStudent(coursePerson);
        //Util.printCourseStudent(courseWorker);
        Util.printCourseStudent(courseStudent);
        Util.printCourseStudent(courseHighStudent);

    }

}
