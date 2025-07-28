package chap10.part02;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30};
		
		try {
			for ( int i=0;i<=3;i++ ) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("arr[3]은 없는 인덱스 입니다.");
		} finally {
			System.out.println("저는 에러가 나던 안나던 실행됩니다.");
		}
		
		System.out.println("저는 20번 라인입니다.");
		
	}

}
