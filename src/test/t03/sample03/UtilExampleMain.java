package test.t03.sample03;

import test.t03.common.Cat;
import test.t03.common.Dog;

public class UtilExampleMain {
    public static void main(String[] args) {
        testRooming();
        testAnimaling();
        testAreTheyFriend();
        testCompare();
    }

    private static void testRooming() {
        Room<Cat> r1 = new Room<>(new Cat("hanyang"));
        Room<Cat> r2 = new Room<>(new Cat("ira"));
        System.out.println(">>>>> room1,2 : " + r1 + ", " + r2);

        Room<Dog> r3 = Util.rooming(new Dog("teemo"));
        System.out.println(">>>>> room3 : " + r3);
    }

    private static void testAnimaling() {

    }

    private static void testAreTheyFriend() {

    }

    private static void testCompare() {

    }
}
