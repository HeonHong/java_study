package salary.bean;

public class SalaryDTO {
	
	private int employeeNo;
	private String name, position;
	private int basePay, extraPay;
	private double taxRate;
	private int salary;
	
	public SalaryDTO() {
		
	}
	
	public SalaryDTO(int employeeNo, String name, String position, int basePay, int extraPay) {
		super();
		this.employeeNo = employeeNo;
		this.name = name;
		this.position = position;
		this.basePay = basePay;
		this.extraPay = extraPay;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public int getExtraPay() {
		return extraPay;
	}

	public void setExtraPay(int extraPay) {
		this.extraPay = extraPay;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void calc() {
		salary = basePay + extraPay;
		if(salary> 4000000) taxRate = 0.03;
		else if(salary>2000000) taxRate = 0.02;
		else taxRate = 0.01;
	}
	@Override
	public String toString() {
		return employeeNo + "\t" + name + "\t" + basePay+ "\t" + extraPay + "\t" + taxRate + "\t" + salary;
	}

}
