package day09;


// Artist 정보를 담기 위한 자료형 설계하기
public class Team {

	private String newName; 
	private int age; 	// 활동 연차
	private int debut;
	private String album;
	private String[] bestsong;
	
	
	//생성자 (객체가 생성될 때 단 한번 호출됨)
	//생성자 : 리턴형을 명시하면 안됨
	//생성자 : 이름이 반드시 클래스명과 동일해야 한다
	
	public Team(String newName, int age, int debut, String titleSong,  String[]bestsong ) {
		this.newName = newName;
		this.age = age;
		this.debut = debut;
		this.album = album;
		this.bestsong = bestsong;
	}
	
	
	
	public void printArtist() {
		System.out.println("가수 이름: " + this.newName);
		System.out.println("활동 연차: " + this.age);
		System.out.println("앨범: " + this.debut);
		System.out.println("대표 곡: " + this.album);
		System.out.print("대표곡: ");
		/*
		for (String str : this.bestsong) {
			System.out.print(str + "   ");
		}*/
		
		for(int i=0; i< bestsong.length ; i++) {
			System.out.print( bestsong[i] + "   ");
			
		}
	}
	

	
}
