package app;
import lib.Calculator;

public class GoodCalc implements Calculator{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int sub(int a, int b) {
		return a - b;
	}
	@Override
	public double average(int[] nums) {
		double sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum / nums.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "12";
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.sub(1, 2));
		System.out.println(calc.average(new int[] {1, 2, 3, 4}));
	}
}