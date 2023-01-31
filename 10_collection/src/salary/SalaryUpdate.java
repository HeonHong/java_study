package salary;

import java.util.ArrayList;
import java.util.Scanner;
import salary.bean.SalaryDTO;

public class SalaryUpdate implements Salary{

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner scan = new Scanner(System.in);
		int employeeNo;
		
		System.out.print("사원번호를 입력하세요.");
		employeeNo = scan.nextInt();
		System.out.println("사원번호\t\t이름\t직급\t기본급\t수당\t월급\t세율");
		
		int sw = 0;
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getEmployeeNo() == employeeNo) {
		
			System.out.println(list.get(i).getEmployeeNo() + "\t\t" +
					list.get(i).getName() + "\t" +
					list.get(i).getPosition() + "\t" +
					list.get(i).getBasePay() + "\t" +
					list.get(i).getExtraPay() + "\t" +
					list.get(i).getSalary() + "\t" +
					list.get(i).getTaxRate());
					sw++;
					
					System.out.print("바꿀 직급을 입력하세요.");
					list.get(i).setPosition(scan.next());
					System.out.print("바꿀 기본급을 입력하세요.");
					list.get(i).setBasePay(scan.nextInt());
					System.out.print("바꿀 수당을 입력하세요.");
					list.get(i).setExtraPay(scan.nextInt());
					list.get(i).calc();
					break;
			}//if
			
			
		
		}//for
		if(sw == 0) System.out.println("잘못된 번호입니다.");
		
		
	}//execute

	

}
