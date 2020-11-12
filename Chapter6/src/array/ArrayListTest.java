package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("aaa"); // ArrayList에 커서 놓고 F1키 누르면 help 나옴
		list.add("bbb");
		list.add("ccc");

		for (int i = 0; i < list.size(); i++) { // length는 10개중 3개의 element만 있어도 10 size()는 3 반환
			
			String str = list.get(i);
			System.out.println(str);
		}
		for(String s : list) {
			System.out.println(s);
		}
	}

}
