package day09;


// Artist 정보를 담기 위한 자료형 설계하기
public class Artist2 {

	private String newName; 
	private int age;
	private int debut;
	private String titleSong;
	
	public void input(String newName) {
		this.newName = newName;
		this.age = age;
		this.debut = debut;
		this.titleSong = titleSong;
	}
	
	public void printArtist() {
		System.out.println(this.newName);
		System.out.println(this.age);
		System.out.println(this.debut);
		System.out.println(this.titleSong);
	}

}
