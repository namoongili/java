package day09;

public class Team2 {


	private String newName;
	private int age;
	private int debut;
	private String album;
	private String[] bestsong;
	
	
	public Team2(String newName, int age, int debut, String titleSong,  String[]bestsong ) {
		this.newName = newName;
		this.age = age;
		this.debut = debut;
		this.album = album;
		this.bestsong = bestsong;
	}
	
	public void printArtist() {
		System.out.println("가수 이름: " + this.newName);
		System.out.println("활동 년차: " + this.age) ;
		System.out.println("앨범: " + this.debut);
		System.out.println("대표 곡: " + this.album);
		System.out.println("대표곡: ");
		
		for(int i=0; i< bestsong.length; i++) {
			System.out.println(bestsong[i] + " ");
		}
	}

}
