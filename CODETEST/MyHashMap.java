import java.util.*;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<Integer, String>();
        hs.put(1, "one");
        hs.put(2, "two");

        System.out.println(hs.get(1));
    }
}
