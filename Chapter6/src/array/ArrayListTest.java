package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("aaa"); // ArrayList�� Ŀ�� ���� F1Ű ������ help ����
		list.add("bbb");
		list.add("ccc");

		for (int i = 0; i < list.size(); i++) { // length�� 10���� 3���� element�� �־ 10 size()�� 3 ��ȯ
			
			String str = list.get(i);
			System.out.println(str);
		}
		for(String s : list) {
			System.out.println(s);
		}
	}

}
