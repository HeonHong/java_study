package constructor;

public class ExamMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam02 me = new Exam02();
		me.compare();
		
		System.out.print(me.getName()+"\t");
		for(int i=0;i<me.getOx().length;i++) {
			System.out.print(me.getOx()[i] +" ");
		}
		System.out.println("\t" + me.getScore());
		
	}

}
