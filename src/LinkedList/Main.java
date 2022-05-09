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

        Util.union(n1, n2);
        Util.union(n3, n4);
        Util.union(n3, n5);

        Util.putNode(n1);
        Util.putNode(n3);
        Util.putNode(Util.findSet(n5));

        Util.union(n2, n4);
        Util.putNode(Util.findSet(n3));

    }

}
