package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");

		//Zoo클래스의 tiger() 호출
		//다른 패키지라서 Zoo zoo = new Zoo(); 불가 import필요
		Zoo zoo = new Zoo();
		zoo.tiger();
		//zoo.giraffe(); 자식도 아니고 같은 패키지도 아니니까.
		//zoo.elephant(); 같은 패키지가 아니라서
		//zoo.lion(); private이라서
	}

}
