package test.t03.sample03;

public class Animal<K, O> {

    private K kind;
    private O old;

    public Animal() { }

    public Animal(K kind, O old) {
        this.kind = kind;
        this.old = old;
    }

    public K getKind() { return this.kind; }
    public O getOld() { return this.old; }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[Animal : ");
        sb.append(this.kind);
        sb.append(", ");
        sb.append(this.old);
        sb.append("]");

        return sb.toString();
    }
}
