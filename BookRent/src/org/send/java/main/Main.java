package org.send.java.main;
import java.util.Scanner;
import java.io.*;

class Main {
	static FileWriter FW;
	static FileInputStream FIS;
	static InputStreamReader ISR;
	static BufferedWriter BW;
	static BufferedReader BR;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			FW = new FileWriter("C:\\fileTest\\register.txt");
			FIS = new FileInputStream("C:\\fileTest\\register.txt");
			ISR = new InputStreamReader(FIS);
			BW = new BufferedWriter(FW);
			BR = new BufferedReader(ISR);
			System.out.println("작업을 선택하세요");
		}catch(IOException e) {
			e.printStackTrace();
		}
		boolean isStop = false;
		do{
			String op = sc.next();
			switch(op) {
			case "회원가입":
				System.out.println("회원 가입");
				Main main = new Main();
				register(sc);
				break;
			case "책리스트":
				System.out.println("책 리스트");
				break;
			case "책대출":
				System.out.println("책 대출");
				break;
			case "종료":
				System.out.println("프로그램 종료");
				isStop = true;
			}
		}while(!isStop);

	}
	public static void register(Scanner sc) {
		System.out.println("데이터를 지시에 따라 입력하세요");
		System.out.println("아이디를 입력하세요");
		String ID = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String PW = sc.nextLine();
		System.out.println("이메일을 입력하세요");
		String EMAIL = sc.nextLine();
		UserData userData = new UserData(ID, PW, EMAIL);
		
		
	}

}
