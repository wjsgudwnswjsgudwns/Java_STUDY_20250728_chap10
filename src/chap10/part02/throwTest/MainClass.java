package chap10.part02.throwTest;

public class MainClass {

	public static void main(String[] args) {

		ThrowsSample throwsSample = new ThrowsSample();
		
		
//		try {
//			throwsSample.ZeroDivid(); // ArithmeticException (10 / 0)
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("모든 수는 0으로 나눌수 없습니다.");
//		}
		
		
		try {
			throwsSample.ZeroDivid(); // ArithmeticException (10 / 0)
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("저는 10번 라인입니다.");
	}

}
