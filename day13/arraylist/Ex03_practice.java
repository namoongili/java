package day13.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex03_practice {

	public static void main(String[] args) {
		
		ArrayList <Score> list = new ArrayList<>();
		list.add(new Score("김채운", 100, 90));
		list.add(new Score("주형준", 80, 70));
		list.add(new Score("김솔", 60, 50));
		list.add(new Score("송수빈", 40, 30));
		list.add(new Score("이효진", 20, 10));
		
		for( int i=0; i<list.size(); i++) { // score 로 형 변환 마치고 빼냄
			
			Score s = list.get(i);
			System.out.println(s.toString());
			s.printInfo();
		}

	}

}
