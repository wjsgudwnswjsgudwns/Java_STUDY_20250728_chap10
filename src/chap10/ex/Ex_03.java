package chap10.ex;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		try {
			int a = scanner.nextInt();
			
			if (a%2==0) {
				System.out.println("짝수!");
			} else {
				System.out.println("홀수!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("정수가 아닙니다");
		}
		

	}

}
