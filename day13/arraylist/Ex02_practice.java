package day13.arraylist;

import java.util.ArrayList;

public class Ex02_practice {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(new Score("김채운", 100, 90));
		list.add(new Score("주형준", 80, 70));
		list.add(new Score("김솔", 60, 50));
		list.add(new Score("송수빈", 40, 30));
		list.add(new Score("이효진", 20, 10));
		
		for(int i=0; i<list.size(); i++) {
			Object o = list.get(i);
			//o.printInfo() //사용할 수 없다(업캐스팅 !!!) => 부모형만큼만 사용할 수 있다.
			
			//다운캐스팅해야 올바르게 Score객체 기능을 사용할수있음
			((Score)o).printInfo();
			System.out.println(o.toString());
		}

	}

}
