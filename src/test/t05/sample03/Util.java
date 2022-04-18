package test.t05.sample03;

public class Util {

    public static <T> Box<T> boxing(T type) {
        return new Box<>(type);
    }

    public static <K, V> Pair<K, V> pairing(K key, V value) {
        return new Pair<>(key, value);
    }

    public static <T> boolean equals(Box<T> b1, Box<T> b2) {
        //return b1.toString().equals(b2.toString());
        return String.valueOf(b1).equals(String.valueOf(b2));
    }

    public static <K, V> boolean equals(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = String.valueOf(p1.getKey()).equals(String.valueOf(p2.getKey()));
        boolean valueCompare = String.valueOf(p1.getValue()).equals(String.valueOf(p2.getValue()));
        return keyCompare && valueCompare;
    }


}
