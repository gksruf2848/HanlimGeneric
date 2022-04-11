package test.t01.sample03;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair() { };

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return this.key; }
    public V getValue() { return this.value; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Pair : ");
        sb.append(this.key);
        sb.append(", ");
        sb.append(this.value);
        sb.append("]");

        return sb.toString();
    }
}
