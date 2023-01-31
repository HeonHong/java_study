package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.tiger();
		//zoo.giraffe(); 부모 것으로 생성한 것이라서??
		//zoo.elephant(); 
		//zoo.lion();

		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe(); //자식 것으로 생성한 것이라서?? 내 것도 내 것 부모 것도 내 것
		//safari.elephant(); 
		//safari.lion();
	}

}
