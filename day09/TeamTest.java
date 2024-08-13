package day09;

import java.util.Scanner;

public class TeamTest {

	public static void main(String[] args) {
		String[] a = new String[] {"팔레트","Celebrity", "Strawberrymoon"};
		String[] b = new String[] {"Attention","Cookie","Hype Boy"};
		String[] c = new String[] {"Pink + White","Solo","Nikes"};
		String[] d = new String[] {"Loosing you","Deep Green","Toroka"};
		

		Team IU = new Team("아이유", 17, 2008, "Palette", a);
		Team NewJeans = new Team("뉴진스", 3, 2022, "New Jeans", b);
		Team FrankOcean = new Team("프랭크오션", 18, 2007, "Blonde", c);
		Team ChristianKuria = new Team("크리스티안쿠리아", 6, 2019, "Borderline", d);
		
		
		
		loop: while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("확인할 아티스트를 선택하세요");
			System.out.println("1.아이유 2.뉴진스 3.프랭크오션 4.크리스티안쿠리아");
			int menu = sc.nextInt();
			
		    sc.nextLine();
		    
			switch(menu){
			case 1:
				IU.printArtist();
				System.out.println(" ");
				break; 	
			case 2:
				NewJeans.printArtist();
				System.out.println(" ");
				break;
			case 3:
				FrankOcean.printArtist();
				System.out.println(" ");
				break;
			case 4:
				ChristianKuria.printArtist();
				System.out.println(" ");
				break;
			case 0:
				System.out.println("검색을 종료합니다");
				break loop;
				default:
				System.out.println("잘못된 번호입니다");
				System.out.println(" ");
			}
		}


		

	}
}
	
