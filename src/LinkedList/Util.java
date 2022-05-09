package LinkedList;

public class Util {

    public static <T> Node<T> makeSet(T data) {
        return new Node<>(data);
    }

    public static <T> Node<T> findSet(Node<T> node) {
        if(node.headNode == node) {
            return node;
        }
        else return findSet(node.headNode);
    }

    public static <T> void union(Node<T> n1, Node<T> n2) {
        if(findSet(n1) != findSet(n2)) {
            changeHead(n1.headNode, n2.headNode);
            findTail(n1).nextNode = findSet(n2);
        }
    }

    public static <T> void changeHead(Node<T> head, Node<T> node) {
        node.headNode = head;
        if(node.nextNode != null) {
            changeHead(head, node.nextNode);
        }
    }

    public static <T> Node<T> findTail(Node<T> node) {
        if(node.nextNode == null) {
            return node;
        }
        else return findTail(node.nextNode);
    }

}
