package co.edu.uniquindio.generics;

public class Box<T>{
    private T value;
    private T value2;

    public Box(T value,T value2) {
        this.value = value;
        this.value2 = value2;
    }


    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }
}
