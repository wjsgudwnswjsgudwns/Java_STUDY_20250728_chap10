package chap10.ex;

public class ThrowsExampleMain {

	public static void main(String[] args) {
		
		ThrowsExample example = new ThrowsExample();
		
		try {
			example.readFile();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("****");
		}

		System.out.println("15번 라인");
	}

}
