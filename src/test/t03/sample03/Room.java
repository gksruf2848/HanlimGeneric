package test.t03.sample03;

public class Room<T> {

    private T type;

    public Room() { }

    public Room(T type) { this.type = type; }

    public T getType() { return this.type; }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[Room : ");
        sb.append(this.type);
        sb.append("]");

        return sb.toString();
    }
}
