package salary;

import java.util.ArrayList;
import java.util.Scanner;
import salary.bean.SalaryDTO;

public class SalarySearch implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner scan = new Scanner(System.in);
		String name;
		
		System.out.print("이름 입력하세요: ");
		name = scan.next();
		System.out.println("사원번호\t\t이름\t직급\t기본급\t수당\t월급\t세율");
		
		int sw=0;
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getName().equals(name) ) {
				
				System.out.println(list.get(i).getEmployeeNo() + "\t\t" +
						list.get(i).getName() + "\t" +
						list.get(i).getPosition() + "\t" +
						list.get(i).getBasePay() + "\t" +
						list.get(i).getExtraPay() + "\t" +
						list.get(i).getSalary() + "\t" +
						list.get(i).getTaxRate());
						sw++;
						break;
			}//if
		}//for
		if(sw==0)System.out.println("잘못된 이름입니다.");
		System.out.println();
	}

	

}
