package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;



public class SungJukService  {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	
	
	
	public void menu() {
		int num;
		Scanner scan = new Scanner(System.in);
		
		SungJuk sungJuk=null;
		
		while(true) {
			System.out.println("*************");
			System.out.println("****1.입력****");
			System.out.println("****2.출력****");
			System.out.println("****3.수정****");
			System.out.println("****4.삭제****");
			System.out.println("****5.정렬***");
			System.out.println("****6.끝***");
			System.out.println("*************");
			System.out.print("번호 : ");
			num = scan.nextInt();
	
			if(num==6) break;//System.exit(0);강제종료
			
			if(num==1) {
				sungJuk = new SungJukInsert();
			}
			else if(num==2){
				sungJuk = new SungJukList();
			}
			else if(num==3) {
				sungJuk = new SungJukUpdate();
			}
			else if(num==4) {
				sungJuk = new SungJukDelete();
			}
			else if(num==5) {
				sungJuk = new SungJukSort();
			}
			else {
				System.out.println("1~6중 선택하세요.");
				continue;
			}
			System.out.println();
			
			sungJuk.execute(list);//호출
		}//while
	}
	
	
}
