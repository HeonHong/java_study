package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("result2");
		PersonDTO personDTO = new PersonDTO("홍길동", 25, 182.5);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(personDTO);//객체로 던져주는 것이고 직렬화는 dto에 implement되어 있다.
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt")) ;
		PersonDTO dto = (PersonDTO) ois.readObject();//자식 = (자식) 부모
		System.out.println("이름 = " + dto.getName());
		System.out.println("나이 = " + dto.getAge());
		System.out.println("키 = " + dto.getHeight());

	}

}
