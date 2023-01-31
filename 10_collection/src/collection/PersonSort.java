package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data + " ");
		}//for
		System.out.println();
		
		Arrays.sort(ar);
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data + " ");
		}//for
		System.out.println();
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디", 30);

		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬 전 = ");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO + " ");
		}//for
		System.out.println();
		
		System.out.println("나이로 오름차순");
		Collections.sort(list);//compareTo랑 같이 엮여서 쓰인다.
		System.out.println("정렬 후 = ");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO + " ");
		}//for
		System.out.println();
		
		System.out.println("이름으로 내림차순");
		//정렬하고 또 정렬할 때 comparator를 사용한다.
		//Comparator com = new Comparator<T>();인터페이스라 불가
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {//익명 Inner Class
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName())*-1; //(내림차순이라 -1)
			}
			};
		
			
			Collections.sort(list, com);
			System.out.println("정렬후");
			for(PersonDTO personDTO:list) {
				System.out.println(personDTO);
				
			}
			
	}
	

}
