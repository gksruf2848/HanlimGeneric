package test.t02.sample01;

public class Box<T,M> {

    private T type;
    private M model;

    public Box() { };

    public Box(T type, M model) {
        this.type = type;
        this.model = model;
    }

    public T getType() { return this.type; }
    public void setType(T type) { this.type = type; }
    public M getModel() { return this.model; }
    public void setModel(M model) { this.model = model; }

    //객체의 이름만 적어도 문자열로 호출 가능
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[");
        sb.append(this.type);
        sb.append(", ");
        sb.append(this.model);
        sb.append("]");

        return sb.toString();
    }
}
