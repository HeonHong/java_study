package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
		int a = 10;//정수형 변수
		int b = 20;
		int c = 30;
		
		int[] ar = {10,20,30};
		
		
		SungJuk_answer aa = new SungJuk_answer();//객체
		SungJuk_answer bb = new SungJuk_answer();
		SungJuk_answer cc = new SungJuk_answer();

		SungJuk_answer[] ar1 = new SungJuk_answer[3];//객체 배열. 여기까진 방만 만들어 준 개념
		/*
		ar1[0] = new SungJuk_answer();//주소가 들어옴.
		ar1[1] = new SungJuk_answer();
		ar1[2] = new SungJuk_answer();

		aa.setData("홍길동", 90, 95, 100);//메소드 호출
		aa.calc();
		System.out.println(aa.getName() + "\t"
						+aa.getKor() + "\t"
						+aa.getEng() + "\t"
						+aa.getMath() + "\t"
						+aa.getTot() + "\t"
						+aa.getAvg() + "\t"
						+aa.getGrade());
		*/
		
		
		for(int i=0;i<ar1.length;i++) {
			ar1[i] = new SungJuk_answer();
		}//fori
		
		ar1[0].setData("홍길동", 90, 95, 100);
		ar1[1].setData("프로도", 100, 89, 75);
		ar1[2].setData("죠르디", 75, 80, 48);
		
		for(int i=0;i<ar1.length;i++) {
			ar1[i].calc();
			System.out.println(ar1[i].getName() + "\t"
					+ar1[i].getKor() + "\t"
					+ar1[i].getEng() + "\t"
					+ar1[i].getMath() + "\t"
					+ar1[i].getTot() + "\t"
					+ar1[i].getAvg() + "\t"
					+ar1[i].getGrade());
		}//fori
		
		System.out.println();
		
		for(SungJuk_answer s:ar1) {
			s.calc();
			System.out.println(s.getName() + "\t"
					+s.getKor() + "\t"
					+s.getEng() + "\t"
					+s.getMath() + "\t"
					+s.getTot() + "\t"
					+s.getAvg() + "\t"
					+s.getGrade());
		}
	}

}
