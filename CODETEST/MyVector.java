import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<Point>();
        v.add(new Point(10, 20));
        v.add(new Point(1, 2));

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i).toString());
        }
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}