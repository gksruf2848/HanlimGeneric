package test.t01.sample03;

import test.t01.common.Car;
import test.t01.common.Tv;

import java.net.CacheRequest;

public class UtilExampleMain {

    public static void main(String[] args) {

        testBoxing();
        testPairing();
        testEquals();
        testCompare();

    }

    private static void testBoxing() {

        Box<?> box = null;
        box = Util.boxing(new Car("임한결의 차"));
        System.out.println(">>> box : " + box);

    }

    private static void testPairing() {

        Pair<?, ?> pair = null;
        pair = Util.pairing("Lim", new Tv("임한결의 티비"));
        System.out.println(">>> pair : " + pair);

    }

    private static void testEquals() {

        Pair<String, Car> p1 = Util.pairing("Ho", new Car("ho's car"));
        Pair<String, Car> p2 = Util.pairing("Han", new Car("han's car"));
        System.out.println(">>> equals : " + Util.equals(p1, p2));

    }

    private static void testCompare() {

        Box<Integer> box1 = new Box<>(5);
        Box<Double> box2 = new Box<>(5.5);
        System.out.println(">>> compare : " + Util.compare(box1.getType(), box2.getType()));

    }

}