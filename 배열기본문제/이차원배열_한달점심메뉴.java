package 배열기본문제;

public class 이차원배열_한달점심메뉴 {

	public static void main(String[] args) {

		//2차원배열만들기
		//행,열에대한첨자가필요하다
		

		//2차원 배열 초기화
		//행, 열
		
		//1차원배열을 요소로 가지는 배열
		String[][] foods = {
				{"메뉴1", "메뉴2", "메뉴3", "메뉴4", "메뉴5"}, //1주차 점심
				{"메뉴6", "메뉴7", "메뉴8", "메뉴9", "메뉴10"}, //2주차 점심
				{"메뉴11", "메뉴12", "메뉴13", "메뉴14", "메뉴15"}, //2주차 점심
		};
		
		//1주차
		System.out.println("1주차 메뉴이다");
		for(int i=0; i<5; i++) {
			System.out.println(foods[0][i]);
		}

		System.out.println("\n2주차 메뉴이다");
		for(int i=0; i<5; i++) {
			System.out.println(foods[1][i]);
		}
		
		System.out.println("\n3주차 메뉴이다");
		for(int i=0; i<5; i++) {
			System.out.println(foods[2][i]);
		}
		
				
		}
	}


