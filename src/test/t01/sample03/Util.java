package test.t01.sample03;

public class Util {
    <T> Box<T> boxing(T type) {
        return new Box<>(type);
    }

    <K, V> Pair<K, V> pairing(K key, V value) {
        return new Pair<>(key, value);
    }

    <K, V> boolean equals(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = String.valueOf(p1.getKey()).equals(String.valueOf(p2.getKey()));
        boolean valueCompare = String.valueOf(p1.getValue()).equals(String.valueOf(p2.getValue()));
        return keyCompare && valueCompare;
    }

    <T> int compare(T type1, T type2) {
        
    }
}
