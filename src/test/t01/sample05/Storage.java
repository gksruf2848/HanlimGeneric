package test.t01.sample05;

public interface Storage<T> {
    public void add(T type, int index);
    public T get(int index);
}
