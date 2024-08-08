package 배열기본문제;

public class 삼차원배열 {

	public static void main(String[] args) {
		
		// 면, 행, 열
		int[][][] music = new int[2][3][3];
		
		// 변수 초기화
		// 3차원 배열: 2차원 배열을 요소로 가진다.
		String[][][] str = {
			
			// 0면 2차원 배열
			{
				{"deep green", "toroka", "too good"},
				{"losing you", "tell me when", "ride"},
				{"complicated", "remain", "in your head"}
			},
				 
			// 1면
			{
				{"brand new", "skate with me", "same song"},
				{"no pressure", "blinds", "house"},
				{"all day", "feel this", "blue eyes"}
			}
		};
		
		// 0면 
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(str[0][i][j] + " ");
			}
			System.out.println();
		}
		

		System.out.println();
		
		
		// 1면
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(str[1][i][j] + " ");
			}
			System.out.println();
		}
	}
}
