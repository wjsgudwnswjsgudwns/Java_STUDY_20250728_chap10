package chap10.ex;

import java.util.Scanner;

public class Ex_02_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		
		String str = scanner.nextLine();
		
		if(str.length() == 0) {
			throw new IllegalArgumentException("문자열은 공란으로 입력하시면 안됩니다.");
		} else {
			System.out.println(str.length());
		}
		
		scanner.close();
	}

}
