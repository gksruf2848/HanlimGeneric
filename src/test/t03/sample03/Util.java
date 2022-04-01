package test.t03.sample03;

public class Util {
    public static <T> Room<T> rooming(T type) {
        return new Room<>(type);
    }

    public static <K, O> Animal<K, O> animaling(K kind, O old) {
        return new Animal<>(kind, old);
    }

    public static <K, O> boolean areTheyFriend(Animal<K, O> a1, Animal<K, O> a2) {
        boolean kindCompare = String.valueOf(a1.getKind()).equals(String.valueOf(a2.getKind()));
        boolean oldCompare = String.valueOf(a1.getOld()).equals(String.valueOf(a2.getOld()));
        return kindCompare && oldCompare;
    }

    public static <T extends Number> int compare(Room<T> r1, Room<T> r2) {
        return compare(r1, r2);
    }
}
