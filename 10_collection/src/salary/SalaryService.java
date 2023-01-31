package salary;

import java.util.ArrayList;
import java.util.Scanner;
import salary.bean.SalaryDTO;


public class SalaryService {
	private ArrayList<SalaryDTO> list = new ArrayList<SalaryDTO>();
	
	
	public void menu() {
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		
		Salary salary=null;
		
		while(true) {
			System.out.println("*************");
			System.out.println("****1.등록****");
			System.out.println("****2.출력****");
			System.out.println("****3.수정****");
			System.out.println("****4.검색****");
			System.out.println("****5.삭제****");
			System.out.println("****6.정렬****");
			System.out.println("****7.종료****");
			System.out.println("*************");
			System.out.print("번호 : ");
			num = scan.nextInt();
	
			if(num==7) break;//System.exit(0);강제종료
			
			if(num==1) {
				salary = new SalaryWrite();
			}
			else if(num==2){
				salary = new SalaryPrint();
			}
			else if(num==3) {
				salary = new SalaryUpdate();
			}
			else if(num==4) {
				salary = new SalarySearch();
			}
			else if(num==5) {
				salary = new SalaryDelete();
			}
			else if(num==6) {
				salary = new SalarySort();
			}
			else {
				System.out.println("1~7중 선택하세요.");
				continue;
			}
			System.out.println();
			
			salary.execute(list);//호출
		}//while
		
		
	}//menu

}
