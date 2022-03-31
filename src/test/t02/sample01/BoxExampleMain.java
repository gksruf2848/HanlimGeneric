package test.t02.sample01;

public class BoxExampleMain {
    public static void main(String[] args) {

        Box<String, String> box1 = new Box<>();
        box1.setType("this is type");
        box1.setModel("this is model");
        System.out.println(">>>>>box1_type : " + box1.getType());
        System.out.println(">>>>>box1_model : " + box1.getModel());

        Box<String, Integer> box2 = new Box<>("plastic box", 123);
        System.out.println(">>>>>box2_type : " + box2.getType());
        System.out.println(">>>>>box2_model : " + box2.getModel());

        System.out.println(">>>>>box2 : " + box2);

    }
}
