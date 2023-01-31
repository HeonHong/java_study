/*
[문제] 성적처리
클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
      getName()
      getKor()
      getEng()
      getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100

 */


package class_;

public class SungJuk {

	
	private String name, grade;
	private int kor, eng, math, tot;
	private double avg;
	
	public void setData(String n, int a, int b, int c) {
		name = n;
		kor = a;
		eng = b;
		math = c;
	}
	
	public void calc() {
		tot = kor + eng + math;
		avg = tot/3.;
		if (avg>=90) grade =  "A";
		else if(avg>=80)  grade =  "B";		
		else if(avg>=70)  grade =  "C";
		else if(avg>=60)  grade =  "D";
		else  grade =  "F";
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
	
	public double getAvg() {
		return avg;
	}
	
	public String getGrade() {
		
			return grade;
		
	}
}
