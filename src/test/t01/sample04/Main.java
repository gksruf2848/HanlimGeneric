package test.t01.sample04;

public class Main {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인 과정", 5);
        personCourse.add(new Person("일반인1"));
        personCourse.add(new Person("일반인2"));
        personCourse.add(new Person("직장인1"));
        personCourse.add(new Person("학생1"));
        personCourse.add(new Person("고등학생1"));


        Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
        workerCourse.add(new Worker("직장인2"));

        Course<Student> studentCourse = new Course<>("학생 과정", 5);
        studentCourse.add(new Student("학생2"));
        studentCourse.add(new Student("고등학생2"));

        Course<HighStudent> highStudentCourse = new Course<>("고등 과정", 5);
        highStudentCourse.add(new HighStudent("고등학생3"));

        Util.printCourse(personCourse);
        Util.printCourse(workerCourse);
        Util.printCourse(studentCourse);
        Util.printCourse(highStudentCourse);

        //Util.printCourseStudent(personCourse);
        //Util.printCourseStudent(workerCourse);
        Util.printCourseStudent(studentCourse);
        Util.printCourseStudent(highStudentCourse);

        Util.printCourseWorker(personCourse);
        Util.printCourseWorker(workerCourse);
        //Util.printCourseWorker(studentCourse);
        //Util.printCourseWorker(highStudentCourse);
    }
}
