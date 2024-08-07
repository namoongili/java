package day05;

public class 배열1차원 {

	public static void main(String[] args) {

		int[] a = new int[5];
		String[] b = new String[5];
		boolean[] c = new boolean[5];
		double[] d = new double[5];
		
		//배열의 초기화
		//배열을 선언할 때만 초기화 할 수 있다 !!!
		String drama1 = "카지노";
		String drama2 = "아이언맨";
		String drama3 = "데스티네이션";
		String drama4 = "눈물의여왕";
		String drama5 = "낮과밤이 다른 그녀";
		
		String[] dramas = {"카지노", "아이언맨", "데스티네이션", "눈물의여왕", "낮과밤이다른그녀" };
		
		System.out.println(dramas[0]);
		System.out.println(dramas[1]);
		System.out.println(dramas[2]);
		System.out.println(dramas[3]);
		System.out.println(dramas[4]);
		
		for(int i=0; i<dramas.length; i++) {
			System.out.println(dramas[i]);
		}
		
		// i	dramas[i]	
		// 0 	dramas[i]	
		// 1	dramas[i]	
		// 2	dramas[i]	
		// 3	dramas[i]	
		// 4	dramas[i]	                      
		
	}

}
