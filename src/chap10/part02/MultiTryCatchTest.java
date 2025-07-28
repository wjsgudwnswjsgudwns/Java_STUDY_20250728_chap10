package chap10.part02;

public class MultiTryCatchTest {

	public static void main(String[] args) {
		
		try {
			int a = 10 / 0; // 수학적 에러
			int[] arr = {1,2,3};
			System.out.println(arr[3]); // 범위 에러
		} catch (Exception e) {	 // 그냥 Exception 써라. 만능이다. 
			e.printStackTrace();
		}
		
		System.out.println("*************************");

	}

}
