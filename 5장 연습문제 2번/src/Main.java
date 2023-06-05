interface AdderInterface{
	int add(int x, int y);
	int add(int n);
}

class Myadder implements AdderInterface{
	public int add(int x, int y) {
		return x + y;
	}
	public int add(int n) {
		return (n + n*n) / 2;
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myadder adder = new Myadder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}
}
