package day05;

public class 배열3차원1 {

	public static void main(String[] args) {

							//면,행,열
		int[][][] music = new int[2][3][3];
		
		String[][][] str = {
				
				//0면	2차원배열
				{
					{"a","b","c"},
					{"d","e","f"},
					{"g","h","i"},
				}
				,
				
				//1면
				{
					{"1","2","3"},
					{"4","5","6"},
					{"7","8","9"},
				}
		};
		
		for(int i=0; i<3; i++) {	//행
			for(int j=0; j<3; j++) {	//열
				System.out.println(music[0][i][j]);
			}
		}
		
		for(int i=0; i<3; i++) {	//행
			for(int j=0; j<3; j++) {	//열
				System.out.println(music[1][i][j]);
			}
		}
	}
}
