package chap10.part02.throwTest;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -1;
		if (age < 0) {
			throw new IllegalArgumentException("나이는 음수가 될 수 없습니다."); // 강제로 에러 발생시킴
//			System.out.println("나이는 음수가 될 수 없습니다.");
		}

		System.out.println("저는 12번 라인입니다.");
	}

}
