//package day16.io.객체;
//
//import java.io.ObjectOutputStream;
//
//public class 실습1 {
//
//	public static void main(String[] args) {
//
//		Score s = new Score("주상길",100);
//
//		//객체를 파일에 쓰기
//		//기반스트림 FileOutStream
//		//보조스트림 ObjectOutputStream
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutStream("res/학생.txt"));
//		oos.writeObject(oos);
//		
//		oos.flush();
//	} 
//
//}
