package chap10.part01;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		System.out.println(arr[4]);
		// 배열요소가 4개이므로 인덱스는 3까지만 존재
		
		List<String> list = new ArrayList<String>();
		// 리스트에 요소 넣기
		list.add("Korea");
		list.add("Japan");
		// 리스트에 요소 가져오기
		System.out.println(list.get(2));
		// 존재하지 않는 인덱스 2에 접근하려 했으므로 IndexOutOfBoundsException 오류 발생
		
	}

}
