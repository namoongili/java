package day13.string;

public class Ex05 {

	public static void main(String[] args) {

		String str = "AWESOME-amazing";

		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(5)); // 맨 앞에서 5만큼 건너띄기
		System.out.println(str.substring(1,4)); // 1인덱스 ~ 4 인덱스 전까지
		String[] result = str.split("-");	
		
		for( String s : result) {
			System.out.println(s);
		}
		
		
		String str2="AWESOME-amazing";
		boolean result3 = str.equals(str2);
		System.out.println(result3);
	}

}
