package test.t05.sample03;

import test.t05.common.Car;
import test.t05.common.Tv;

import java.net.CacheRequest;

public class TestMain {

    public static void main(String[] args) {

        testBoxing();
        testPairing();
        testEquarls();

    }

    private static void testBoxing() {

        Box<Car> box = null;
        box = Util.boxing(new Car("한결이의 차"));
        System.out.println(">>> " + box);

    }

    private static void testPairing() {

        Pair<String, Tv> pair = null;
        pair = Util.pairing("한결이의 티비", new Tv("삼송"));
        System.out.println(">>> " + pair);

    }

    private static void testEquarls() {

        Box<Car> box1 = Util.boxing(new Car("자동차"));
        Box<Car> box2 = Util.boxing(new Car("차동자"));
        System.out.println(">>> " + Util.equals(box1, box2));

        Pair<String, Tv> p1 = Util.pairing("tvtv", new Tv("vtvt"));
        Pair<String, Tv> p2 = Util.pairing("tvtv", new Tv("vtvt"));
        System.out.println(">>> " + Util.equals(p1, p2));
    }

}
