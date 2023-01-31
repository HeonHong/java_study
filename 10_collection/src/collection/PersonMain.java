package collection;

import java.util.ArrayList;

public class PersonMain {
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디", 30);

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
				
	}
	
	public static void main(String[] args) {
		
		PersonMain personMain = new PersonMain();
		ArrayList<PersonDTO> list = personMain.init();//호출
		System.out.println(list);
		System.out.println(list.get(0).getName());
		
		for(PersonDTO personDTO:list) {
			System.out.println(personDTO);
		}
		
	}
}
