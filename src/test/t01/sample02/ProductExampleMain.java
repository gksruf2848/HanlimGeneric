package test.t01.sample02;

import test.t01.common.Car;

public class ProductExampleMain {
    public static void main(String[] args) {
        Product<Car, String> product1 = new Product<>();
        product1.setType(new Car());
        product1.setModel("model");
        System.out.println(">>>>> product : ");
    }
}
