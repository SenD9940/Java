import java.io.*;

public class FileEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("Users\\fbf\\Desktop\\한국교통대학교\\2학년 1학기\\JAVA\\myFile.txt"));
			String str = "hello world\n";
			for(int i = 0; i < 5; i++) {
				out.write(str);
			}
			out.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
