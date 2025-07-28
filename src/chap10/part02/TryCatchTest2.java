package chap10.part02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchTest2 {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
