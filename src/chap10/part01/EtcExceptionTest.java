package chap10.part01;

import java.io.FileReader;

public class EtcExceptionTest {

	public static void main(String[] args) {
		
		// 0 나누기
		int a = 1 / 0;
		// ArithmeticException
		
		// FileNotFoundException
//		FileReader reader = new FileReader("abc.txt");
		// 외부 파일을 불러오는 명령문은 파일이 존재하지 않을 가능성이 항상 존재하므로
		// 반드시 예외처리 구문으로만 구현 가능함

	}

}
