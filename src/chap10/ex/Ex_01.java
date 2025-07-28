package chap10.ex;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		System.out.println("분자를 입력하세요.");
		int a1 = scanner.nextInt();
		System.out.println("분모를 입력하세요.");
		try {
			int b1 = scanner.nextInt();
			
			System.out.println(a1/b1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("분모가 0이 될수 없습니다.");
		}

		System.out.println("25번 라인");
	}

}
