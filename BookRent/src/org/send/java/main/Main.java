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
			System.out.println("�۾��� �����ϼ���");
		}catch(IOException e) {
			e.printStackTrace();
		}
		boolean isStop = false;
		do{
			String op = sc.next();
			switch(op) {
			case "ȸ������":
				System.out.println("ȸ�� ����");
				Main main = new Main();
				register(sc);
				break;
			case "å����Ʈ":
				System.out.println("å ����Ʈ");
				break;
			case "å����":
				System.out.println("å ����");
				break;
			case "����":
				System.out.println("���α׷� ����");
				isStop = true;
			}
		}while(!isStop);

	}
	public static void register(Scanner sc) {
		System.out.println("�����͸� ���ÿ� ���� �Է��ϼ���");
		System.out.println("���̵� �Է��ϼ���");
		String ID = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String PW = sc.nextLine();
		System.out.println("�̸����� �Է��ϼ���");
		String EMAIL = sc.nextLine();
		UserData userData = new UserData(ID, PW, EMAIL);
		
		
	}

}
