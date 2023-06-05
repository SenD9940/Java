
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 100; i++) {
			int count = 0;
			int first = i / 10;
			int second = i % 10;
			if(i > 10 && first % 3 == 0) {
				count += 1;
			}
			if(second % 3 == 0) {
				count += 1;
			}
			if(count == 1) {
				System.out.println(i + " 박수한번");
			}else if(count == 2) {
				System.out.println(i + " 박수두번");
			}
		}
	}

}
