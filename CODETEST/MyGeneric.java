import java.util.*;

public class MyGeneric {
    public static void main(String[] args) {
        MyClass<String> smc = new MyClass<String>();
        smc.set("TEST");
        System.out.println(smc.get());
        MyClass<Integer> imc = new MyClass<Integer>();
        imc.set(100);
        System.out.println(imc.get());
    }
}

class MyClass<T> {
    private T val;

    public void set(T val) {
        this.val = val;
    }

    public T get() {
        return val;
    }
}