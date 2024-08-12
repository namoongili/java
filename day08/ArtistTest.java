package day08;

public class ArtistTest {

	public static void main(String[] args) {


		//artist 정보를 담을 수 있는 변수 만들기
		Artist a = new Artist();
		
		a.name = "Ella Mai";
		a.age = 29;
		a.debut = 2014;
		a.titleSong = "trip";
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.debut);
		System.out.println(a.titleSong);

		printArtist(a);
	}

	
	public static void printArtist(Artist a) {
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.debut);
		System.out.println(a.titleSong);
	}
}
