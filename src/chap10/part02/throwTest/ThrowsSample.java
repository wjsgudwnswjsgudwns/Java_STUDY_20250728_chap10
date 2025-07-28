package chap10.part02.throwTest;

public class ThrowsSample {

	public void ZeroDivid() throws Exception { // 메소드를 호출하는 쪽에서 예외 처리하라고 강제하는 구문 throws
		
		System.out.println(10/0);
		
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("모든 수는 0으로 나눌수 없습니다.");
//		}
	}
	
}
