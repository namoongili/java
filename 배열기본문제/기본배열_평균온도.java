package 배열기본문제;

public class 기본배열_평균온도 {

	public static void main(String[] args) {

		String[] temperature = {"30", "34", "34", "33", "32"};

		int sum = 0;
		for (int temp : temperature) {
			sum += temp;
		}
		double average = (double) sum / temperature.length;
	}

}
