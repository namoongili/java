package day05;

public class 별세개두줄 {
	
    public static void main(String[] args) {
    	
        for (int i = 0; i < 2; i++) { // 두 줄 출력
        	
            for (int j = 0; j < 3; j++) { // 각 줄에 별 세 개 출력
            	
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
