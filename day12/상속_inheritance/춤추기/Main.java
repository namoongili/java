package day12.상속_inheritance.춤추기;

public class Main {

	public static void main(String[] args) {

		Student[] students = new Student[24];
		
		
		students[0] = new CMG();	//주상길
		
		
		//Student 상속받은 자식객체들을 Students 배열로 다루면서 일괄적으로 명령을 줄 수 있다.
		for( int i=0; i<students.length; i++) {
			students[i].춤추기();
		}
				
	}

}
