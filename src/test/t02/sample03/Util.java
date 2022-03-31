package test.t02.sample03;

public class Util {

    public static <T> Box<T> boxing(T type) {
        return new Box<>(type);
    }

    public static <K, V> Pair<K, V> pairing(K key, V value) {
        return new Pair<>(key, value);
    }

    public static <K, V> boolean equals(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = String.valueOf(p1.getKey()).equals(String.valueOf(p2.getKey()));
        boolean valueCompare = String.valueOf(p1.getValue()).equals(String.valueOf(p2.getValue()));
        return keyCompare && valueCompare;
    }

    public static <T extends Number> int compare(T type1, T type2) {
        double d1 = type1.doubleValue();
        double d2 = type2.doubleValue();
        return Double.compare(d1, d2);
    }
}
