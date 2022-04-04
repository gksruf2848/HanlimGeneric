package test.t04.sample03;

public class Util {
    public static <T> Box<T> boxing(T type) { return new Box<>(type); }

    public static <K, V> Pair<K, V> pairing(K key, V value) { return new Pair<>(key, value); }

    public static <K, V> boolean equrls(Pair<K, V> p1, Pair<K, V> p2) {
        boolean b1 = String.valueOf(p1.getKey()).equals(String.valueOf(p2.getKey()));
        boolean b2 = String.valueOf(p1.getValue()).equals(String.valueOf(p2.getValue()));
        return b1 && b2;
    }

    public static <T> boolean compare(Box<T> b1, Box<T> b2) {
        return String.valueOf(b1).equals(String.valueOf(b2));
    }

    public static <T extends Number> int compare2(T t1, T t2) {
        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();
        return Double.compare(d1, d2);
    }
}
