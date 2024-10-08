package day20.chatt실습;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	//서버용 소케
	ServerSocket  serverSocket ;  // 서버가 되기 위한 소켓 	
	Socket  socket;   // 클라이언트와 통신할 수 있는 소켓
	
	//입력용 보조스트림 
	//출력용 보조스트림 
	DataInputStream  is;
	DataOutputStream os;
	
	
	
	
	public Server1() {
		try {
			// 
			serverSocket  = new ServerSocket(5600);   // 포트번호 설정  (5000~9000) :  서버프로그램을 식별하는 값
			System.out.println(" server waiting !!!");			
			socket = serverSocket.accept();  
			
			System.out.println(" start");
			System.out.println(  socket.getInetAddress().toString());
			
			
			is = new  DataInputStream(   socket.getInputStream());  //socket.getInputStream()   입력기반스트림
			os = new DataOutputStream(  socket.getOutputStream());	// socket.getOutputStream() 출력기반스트림
			
			
			//데이터받기
			dataRecv();
			
			//데이터 보내기 
			dataSend();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	//
	private void dataSend() {	
		Scanner sc = new Scanner( System.in);
		
				
		try {
			
			System.out.println("작성할 메시지:");
			String msg = sc.nextLine();
			os.writeUTF(msg);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}





	//수신
	private void dataRecv() {
		
		try {
			String msg=	  is.readUTF();
			System.out.println( msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 
	}






	public static void main(String[] args) {
		 
		Server1   server1  = new Server1();
	}

}
