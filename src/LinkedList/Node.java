package LinkedList;

public class Node<T> {

    public T data;
    public Node<T> headNode;
    public Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.headNode = this;
        this.nextNode = null;
    }

}
