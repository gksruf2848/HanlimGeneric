package test.t01.sample02;

public class ProductExampleMain {
    public static void main(String[] args) {
        Product<Car, String> product1 = new Product<>();
        product1.setType(new Car());
        product1.setModel("model");
        System.out.println(">>>>> product : ");
    }
}
