package LinkedList;

public class Util {

    //Make-Set(data)
    public static <T> Node<T> makeSet(T data) {
        return new Node<>(data);
    }

    //Find-Set(node) : node가 속한 대장 head를 알아냅니다.
    public static <T> Node<T> findSet(Node<T> node) {
        return node.headNode; //그냥 모든 노드에는 대장 head에 대한 정보가 headNode에 담겨 있으므로 그것을 리턴합니다.

        /*
        if(node.headNode == node) {     //만약 해당 노드의 headNode가 자기 자신이라면, 본인이 대장 head라는 뜻이므로
            return node;                //자기 자신을 리턴합니다.
        }
        else return findSet(node.headNode);
        */

    }

    //Union(X, Y) : node X가 속한 집합과, Y가 속한 집합을 합칩니다.
    public static <T> void union(Node<T> n1, Node<T> n2) {
        if(findSet(n1) != findSet(n2)) { //
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
