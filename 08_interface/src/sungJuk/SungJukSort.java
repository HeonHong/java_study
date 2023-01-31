package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("*****************");
			System.out.println("1. 총점으로 내림차순");
			System.out.println("2. 이름으로 오름차순");
			System.out.println("3. 이전메뉴 ");
			System.out.println("*****************");
			System.out.print("번호 : ");
			num = scan.nextInt();
			if(num==3)break;
			
			Comparator<SungJukDTO> com = null;
			if(num==1) {
				com = new Comparator<SungJukDTO>() {
					
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						
						return s1.getTot() < s2.getTot() ? 1 : -1;//내림차순
					}
				};
				
			}else if(num==2) {
					com = new Comparator<SungJukDTO>() {
					
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						
						return s1.getName().compareTo(s2.getName());//오름차순
					}
				};
				
			}//if
			
			Collections.sort(list, com);
			new SungJukList().execute(list);
			

		}//while
	}

}
/*
1. 총점으로 내림차순
2. 이름으로 오름차순
3. 이전메뉴 
*/