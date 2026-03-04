package co.edu.uniquindio.generics;

public class BoxMap<T, U>{
    private T value;
    private U value2;

    public BoxMap(T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public U getValue2() {
        return value2;
    }
    public void setValue2(U value2) {
        this.value2 = value2;
    }
}
