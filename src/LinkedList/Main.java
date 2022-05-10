package LinkedList;

public class Main {

    public static void main(String[] args) {

        Node<String> n1 = Util.makeSet("a");
        Node<String> n2 = Util.makeSet("b");
        Node<String> n3 = Util.makeSet("c");
        Node<String> n4 = Util.makeSet("d");
        Node<String> n5 = Util.makeSet("e");

        //Util.putNode(n1);
        //Util.putNode(n2);
        //Util.putNode(n3);
        //Util.putNode(n4);
        //Util.putNode(n5);




        // (a, b) (c, d, e)
        Util.union(n1, n2);
        Util.union(n3, n4);
        Util.union(n3, n5);

        System.out.println(">>>>> n1이 속한 집합 출력 :");
        Util.putNode(n1);

        System.out.println(">>>>> n3이 속한 집합 출력 :");
        Util.putNode(n3);

        System.out.println(">>>>> n5이 속한 집합 출력 :");
        Util.putNode(Util.findSet(n5));




        // (a, b, c, d, e)
        Util.union(n2, n4);

        System.out.println(">>>>> n3이 속한 집합 출력 :");
        Util.putNode(Util.findSet(n3));

    }

}
