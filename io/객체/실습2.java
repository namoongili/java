//package day16.io.객체;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//public class 실습2 {
//
//	public static void main(String[] args) {
//		
//		Score s = new Score ("주상길",100);
//		Score s = new Score ("전지형", 99);
//
//
//		//기반스트림 : FileInputStream
//		//보조스트림 : ObjectInputStream
//
//		
//		ObjectInputStream ois;
//		try {
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/학생.txt"));
//		
//		Object o = ois.readObject();
//		Score s = (Score)o;
//		
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		ois.readObject();
//	}
//
//}
