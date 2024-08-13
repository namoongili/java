package day09;

public class JamesTest {

	public static void main(String[] args) {

		James j = new James();
		j.input(40, "James", true, 3);
		j.printInfo();
	}

}

/*
나이가 40살, 이름이 james 라는 남자가 있습니다.
이 남자는 결혼을 했고  자식이 셋 있습니다.

출력결과
이 사람이 나이
이 사람의 이름
이 사람의 결혼 여부
이사람의 자녀수

(각 멤버변수에 맞는 자료형을 생각해 보세요: 결혼여부 isMarried => boolean)*/
