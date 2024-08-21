package day13.string;

public class Ex04_Practice {

	public static void main(String[] args) {

		String lyrics ="Love is a variety of different feelings, states, and" +
				"attitudes that ranges from interpersonal affection to pleasure";
		
		int cnt = 0;
		for( int i=0; i<lyrics.length(); i++) {
			char ch = lyrics.charAt(i);
			if( ch == 'l') { //알파벳 'l' 개수
				
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
