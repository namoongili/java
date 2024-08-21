package day13.arraylist;

import java.util.ArrayList;

public class Ex01_practice {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		int size = list.size();
		System.out.println(size);
		
		
		
		Object obj = list.get(0);
		System.out.println(obj);

		//다운캐스팅
		char ch = ((String)obj).charAt(0);
		System.out.println(ch);

	}

}
