package class_;

public class SungJukMain_Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SungJuk_answer aa = new SungJuk_answer();
		
		aa.setData("홍길동", 90, 95, 100);//메소드 호출
		aa.calc();
		System.out.println(aa.getName() + "\t"
						+aa.getKor() + "\t"
						+aa.getEng() + "\t"
						+aa.getMath() + "\t"
						+aa.getTot() + "\t"
						+aa.getAvg() + "\t"
						+aa.getGrade());
		
		
		//==============================================================
		SungJuk_answer bb;
		bb = new SungJuk_answer();
		bb.setData("프로도", 100, 89, 75);
		bb.calc();
		System.out.println(bb.getName() + "\t"
						+bb.getKor() + "\t"
						+bb.getEng() + "\t"
						+bb.getMath() + "\t"
						+bb.getTot() + "\t"
						+bb.getAvg() + "\t"
						+bb.getGrade());
		
		//==============================================================
				SungJuk_answer cc;
				cc = new SungJuk_answer();
				cc.setData("죠르디", 75, 80, 48);
				cc.calc();
				System.out.println(cc.getName() + "\t"
								+cc.getKor() + "\t"
								+cc.getEng() + "\t"
								+cc.getMath() + "\t"
								+cc.getTot() + "\t"
								+cc.getAvg() + "\t"
								+cc.getGrade());
		
				
		
	}

}
