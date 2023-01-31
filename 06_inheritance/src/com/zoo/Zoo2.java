package com.zoo;

public class Zoo2 {

	public static void main(String[] args) {
		System.out.println("빨간 사과");

		//Zoo클래스의 tiger() 호출
		
		Zoo zoo = new Zoo();
		zoo.tiger();
		zoo.giraffe(); 
		zoo.elephant(); 
		//zoo.lion(); private이라서
		//private빼고 다 접근가능하다.
		
	}

}
