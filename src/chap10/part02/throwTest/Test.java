package chap10.part02.throwTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"10", "2a"};
		int value = 0;
		for (int i=0;i<=2;i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과해음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
		}
	}

}
