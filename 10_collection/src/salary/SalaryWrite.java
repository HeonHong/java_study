package salary;

import java.util.ArrayList;
import java.util.Scanner;
import salary.bean.SalaryDTO;

public class SalaryWrite implements Salary{

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner scan = new Scanner(System.in);
		int employeeNo;
		String name, position;
		int basePay, extraPay, taxRate, salary;
		
		System.out.print("사원 번호를 입력하세요 : ");
		employeeNo = scan.nextInt();
		
		for(SalaryDTO salaryDTO: list ) {
			if(salaryDTO.getEmployeeNo() == employeeNo) {
				System.out.println("사원번호 중복으로 등록 불가");
				return;
			}
		}
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.next();
		System.out.print("직급을 입력하세요 : ");
		position = scan.next();
		System.out.print("기본급을 입력하세요 : ");
		basePay = scan.nextInt();
		System.out.print("수당 입력하세요 : ");
		extraPay = scan.nextInt();
		
		SalaryDTO salaryDTO = new SalaryDTO(employeeNo, name, position, basePay, extraPay);
		salaryDTO.calc();
		
		list.add(salaryDTO);
		System.out.println("입력되었습니다.");
	}


	



}
