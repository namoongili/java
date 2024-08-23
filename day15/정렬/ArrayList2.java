package day15.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList2 {

	public static void main(String[] args) {


		ArrayList<Score3> list = new ArrayList<>();
		
		list.add(new Score3("김세중", 100, 80));
		list.add(new Score3("황지영", 89, 99));
		list.add(new Score3("하예진", 88, 100));
		list.add(new Score3("김정석", 99, 78));
		list.add(new Score3("김세현", 87, 89));
		
		Collections.sort(list, new Comparator<Score3>() {

			@Override
			public int compare(Score3 o1, Score3 o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});

	}

}
