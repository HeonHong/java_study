package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	
	public static void main(String[] args) {
		
		//
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			dos.writeUTF("홍길동");
			dos.writeInt(25);//int인데 왜 txt에서 읽어내지를 못하나?
			dos.writeDouble(182.5);
			
			dos.close();// 이거 꼭 작성해 주어야할 것!!
			
			//파일로부터 입력
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));//result 오타나면 FileNotFoundException 뜬다.
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			System.out.println("이름 = " + name);
			System.out.println("나이 = " + age);
			System.out.println("키 = " + height);
			
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//catch (FileNotFoundException e)대신 IOException으로 잡으면 상속관계라 하나만 쳐도 오류 없음.
		
	}
}
