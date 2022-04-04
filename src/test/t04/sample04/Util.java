package test.t04.sample04;

import test.t01.sample04.Course;
import test.t01.sample04.Student;
import test.t01.sample04.Worker;

import java.util.Arrays;

public class Util {

    public static void printCourse(test.t01.sample04.Course<?> course) {
        System.out.println(">>>>> " + course.getName() + "\t" + Arrays.toString(course.getStudents()));
    }

    public static void printCourseStudent(test.t01.sample04.Course<? extends Student> course) {
        System.out.println(">>>>> " + course.getName() + "\t" + Arrays.toString(course.getStudents()));
    }

    public static void printCourseWorker(Course<? super Worker> course) {
        System.out.println(">>>>> " + course.getName() + "\t" + Arrays.toString(course.getStudents()));
    }
}
