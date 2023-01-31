package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException/*FileNotFoundException가 상속클래스여서*/ {

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		while((data = bis.read())!= -1) {
			//bis.read()는 return값이 int형이라서 bis.rea()를 하면 BufferedInputStream형을 int로 형변환해주는 것이 아니라 int형으로 값은 보내는 것이다.
			//질문. 마지막 data 때문에 int로 선언한 부분은 이해가는데 왜 다른 것들은 int형으로 받는지?
			//데이터를 아스키코드 값으로 읽어오기 때문에 int형으로 선언하는 것이다.
		System.out.print((char)data);
	
		}//while
		bis.close();
	}

}
