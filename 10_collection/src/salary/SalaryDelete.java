package salary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryDelete implements Salary{

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		
		Scanner scan = new Scanner(System.in);
		int employeeNo;
		
		System.out.print("사원번호를 입력하세요.");
		employeeNo = scan.nextInt();
		
		Iterator<SalaryDTO> it = list.iterator();
		int sw=0;
		while(it.hasNext()) {
			//SalaryDTO salaryDTO = it.next();
			
				if(it.next().getEmployeeNo()==employeeNo) {
				it.remove();
				sw++;
				System.out.println(employeeNo + "의 데이터가 삭제되었습니다.");
			}//if
		}//while
		if(sw == 0) System.out.println("삭제할 번호가 없습니다.");
		
	}

	

}
