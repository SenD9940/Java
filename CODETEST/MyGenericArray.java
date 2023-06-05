import java.util.*;

public class MyGenericArray {
    MyClassArray<String> MCA = new MyClassArray<String>(10);

}

class MyClassArray<T> {
    private T[] array;
    private int index = 0;

    public MyClassArray(int size) {
        this.array = (T[]) (new Object[size]);
    }

    public void add(T val) {
        array[index++] = val;
    }

    public T get(int index) {
        return array[index];
    }
}
