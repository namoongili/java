//package day16.io.보조;
//
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class 실습InputStreamReader {
//
//	public static void main(String[] args) {
//
//		/*
//		try {
//			
//			int ch = System.in.read();
//			System.out.println((char)ch);
//			
//			ch = System.in.read();
//			System.out.println((char)ch);
//			
//			ch = System.in.read();
//			System.out.println((char)ch);
//			
//			ch = System.in.read();
//			System.out.println((char)ch);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	// 한 바이트씩
//		
//		*/
//		
//		// 보조스트림, 한문자씩 읽기위한 보조스트림 사용
//		// 보조스트림은 기반스트림없이 생성될 수 없다
//		
//		// InputStreamReader a = new InputStreamReader(); 보조스트림은 기본생성자로 생성될수없다. => 기반스트림이 있어야 하므로
//			InputStreamReader a = new InputStreamReader(System.in);
//			
//			try {
//				int result = a.read();
//				System.out.println((char)result);
//				
//				result = a.read();
//				System.out.println((char)result);
//				
//			
//			
//	
//		
//		
//		
//	}
//
//}
