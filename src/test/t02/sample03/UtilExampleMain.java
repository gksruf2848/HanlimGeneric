package test.t02.sample03;

import test.t02.common.Car;
import test.t02.common.Tv;

public class UtilExampleMain {
    public static void main(String[] args) {
        testBox();
        testPair();
        testEquals();
        testCompare();
    }

    private static void testBox() {
        Box<Car> box1 = new Box<>(new Car("hyundai"));
        Box<Tv> box2 = new Box<>(new Tv("LG"));
        System.out.println(">>>>> box1 : " + box1);
        System.out.println(">>>>> box2 : " + box2);

        Box<String> box3 = new Box<>();
        box3 = Util.boxing("Hello!!!");
        System.out.println(">>>>> box3 : " + box3);
    }

    private static void testPair() {
        Pair<Integer, Car> pair1 = new Pair<>(1234, new Car("morning"));
        Pair<Integer, Car> pair2 = new Pair<>(9876, new Car("sonata"));
        System.out.println(">>>>> pair1 : " + pair1);
        System.out.println(">>>>> pair2 : " + pair2);

        Pair<Integer, Car> pair3 = new Pair<>();
        pair3 = Util.pairing(970328, new Car("lamborghini"));
        System.out.println(">>>>> pair3 : " + pair3);
    }

    private static void testEquals() {
        Pair<Integer, Car> pair1 = new Pair<>(1234, new Car("morning"));
        Pair<Integer, Car> pair2 = new Pair<>(1234, new Car("sonata"));
        System.out.println(">>>>> equals : " + Util.equals(pair1, pair2));

        pair1 = Util.pairing(1234, new Car("morning"));
        pair2 = Util.pairing(1234, new Car("morning"));
        System.out.println(">>>>> equals : " + Util.equals(pair1, pair2));
    }

    private static void testCompare() {
        Box<Integer> box1 = Util.boxing(20);
        Box<Double> box2 = Util.boxing(15.1);
        System.out.println(">>>>> compare : " + Util.compare(box1.getType(), box2.getType()));
    }
}
