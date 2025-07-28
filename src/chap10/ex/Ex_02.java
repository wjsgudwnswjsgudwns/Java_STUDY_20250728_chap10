package chap10.ex;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 문장을 입력하세요.");
		
		String str = scanner.nextLine();
		
		try {
			System.out.println("문장의 길이는 : " + str.length());
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
