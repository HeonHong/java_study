package salary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySort implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("**********1. 이름기준 오름차순**********");
		System.out.println("**********2. 월급으로 내림차순**********");
		System.out.println("***********3. 앞으로 돌아가기**********");
		System.out.println("***********************************");
		System.out.print("번호를 입력하세요 : ");
		num = scan.nextInt();
		System.out.println();
		
		Comparator<SalaryDTO> com = null;
		
		if(num==1) {
			
			com = new Comparator<SalaryDTO>() {//익명 Inner Class
				@Override
				public int compare(SalaryDTO p1, SalaryDTO p2) {
					return p1.getName().compareTo(p2.getName()); //(내림차순이라 -1/ 오름차순 그대로)
				}
			};
			
			System.out.println("이름 기준 오름차순으로 정렬합니다.");
		}else if(num==2) {
			
			com = new Comparator<SalaryDTO>() {//익명 Inner Class
				@Override
				public int compare(SalaryDTO p1, SalaryDTO p2) {
					return p1.getSalary()> p2.getSalary() ?-1 : 1; //
				}
			};
			System.out.println("월급 기준 내림차순 정렬합니다.");
			
		}else if(num==3) {
			
			com = new Comparator<SalaryDTO>() {//익명 Inner Class
				@Override
				public int compare(SalaryDTO p1, SalaryDTO p2) {
					return p1.getEmployeeNo()> p2.getEmployeeNo() ? 1 : -1; //
				}
			};
			System.out.println("사원번호 기준 오름차순 정렬합니다.");
			
		
		
		}else {return;}
		
			Collections.sort(list, com);
		
	}



	

}
