public class Gstack<T>{
	private int sp = 0;
	private int length;
	private T[] Stack;
	public Gstack(int length) {
		this.length = length;
		Stack = (T[])(new Object[length]);
	}
	public void push(T data) {
		if(sp == length) {
			System.out.println("OverFlow");
			return;
		}
		Stack[sp++] = data;
	}
	public T pop() {
		return Stack[--sp];
	}
}