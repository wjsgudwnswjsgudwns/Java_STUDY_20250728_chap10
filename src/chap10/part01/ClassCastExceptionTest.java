package chap10.part01;

public class ClassCastExceptionTest {

	public static void main(String[] args) {

		Object ob = new String("korea"); // 업캐스팅
		Integer a = (Integer) ob; // 다운캐스팅 -> ClassCastException

	}

}
