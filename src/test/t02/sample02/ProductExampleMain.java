package test.t02.sample02;

import test.t02.common.Car;
import test.t02.common.Tv;

public class ProductExampleMain {
    public static void main(String[] args) {
        Product<Car, String> product1 = new Product<>(new Car("Kiea"), "small");
        System.out.println(">>>>> product1 :" + product1);

        Product<Tv, String> product2 = new Product<>(new Tv("Samsung"), "small");
        System.out.println(">>>>> product2 :" + product2);
    }
}