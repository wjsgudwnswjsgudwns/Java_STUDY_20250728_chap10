package chap10.part01;

public class NullPointerExceptionTest {

	public static void main(String[] args) {

		String data = null;
		System.out.println(data.length());
		//참조하고 있는 문자열이 메모리에 존재하지 않는데 존재하지 않는 문자열의 길이를 반환하려고 할때
		//NullPointerException 오류 발생

	}

}
