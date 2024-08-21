package day13.object;

public class Main {

	public static void main(String[] args) {


		ArteMv a = new ArteMv();
		// a.아르떼();
		
		System.out.println(a.toString());	//부모에게 물려받은기능 => 물려받은 그대로 씀
		
		Object obj = a;	//업캐스팅
		
		CurrentMv b = new CurrentMv();
		System.out.println(b);	// b.toString();
		
		Object obj1 = b;
		
		System.out.println(obj1);
		
		//
			Object[] arr = new Object[2];
			arr[0] = a;
			arr[1] = b;
			arr[2] = new ExpectedMv();
		
		System.out.println("Object 객체배열 정보 출력");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			//System.out.println(arr[i].toString());
		}
	}
}
