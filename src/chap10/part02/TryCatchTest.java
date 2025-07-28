package chap10.part02;

public class TryCatchTest {

	public static void main(String[] args) {

		int num = 0;
		try {
			int result = 100 / num ;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("모든 수는 0으로 나눌 수 없습니다. num 값을 확인하세요");
		}
		
		System.out.println("저는 15번 라인 입니다.");

	}

}
