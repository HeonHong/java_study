package salary;

import java.util.ArrayList;
import salary.bean.SalaryDTO;

public class SalaryPrint implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
//		System.out.println("사원번호\t\t이름\t직급\t기본급\t수당\t월급\t세율");
//		for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i).getEmployeeNo() + "\t\t" +
//				list.get(i).getName() + "\t" +
//				list.get(i).getPosition() + "\t" +
//				list.get(i).getBasePay() + "\t" +
//				list.get(i).getExtraPay() + "\t" +
//				list.get(i).getSalary() + "\t" +
//				list.get(i).getTaxRate());}
		
		for(SalaryDTO salaryDTO : list) {
		System.out.println(salaryDTO);
	}
		System.out.println();

		
	}

}
