package class_;

public class SungJuk_answer {

	private String name, grade;
	private int kor, eng, math, tot;
	private double avg;

	public void setData(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng =e;
		math =m;
	}
	
	public void calc() {
		tot = kor + eng + math;
		avg = tot/3.;
		if (avg>=90) 
			grade =  "A";
		else if(avg>=80)  
			grade =  "B";		
		else if(avg>=70)  
			grade =  "C";
		else if(avg>=60)  
			grade =  "D";
		else  
			grade =  "F";
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTot() {
		return tot;
	}
	
	public String getAvg() {
		return String.format("%.2f",avg);
	}
	
	public String getGrade() {
		return grade;
	}
	
	
}
