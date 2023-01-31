package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");//파일 객체 생성. 파일 크기를 알아보기 위해.
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		//파일 크기를 알아야 한다. 그래야 byte의 방 개수를 알맞게 만들어 줄 수 있으니까.
		
		int size = (int)file.length();//파일 크기 계산
		byte[] b = new byte[size];
		bis.read(b,0,size);
		//출력
		//1. for문
		//2. byte[] > String 변환해서 print.
		System.out.println(new String(b));
		
		bis.close();
	}

}
