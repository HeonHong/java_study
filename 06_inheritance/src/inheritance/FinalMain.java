package inheritance;

enum Color{
	RED, BLUE, GREEN
//	0,	  1,	 2
}//상수들이 많을 때, 상수들을 나열한 것.

class Final{
	
	public final String FRUIT="사과";
	public final String FRUIT2;
	
	
	public static final String ANIMAL = "사자";//생성자에서 초기화 불가하다.
	public static final String ANIMAL2;//

//	public static final int RED =0;
//	public static final int GREEN =1;
//	public static final int BLUE =2;
	
	static {
		ANIMAL2 ="기린";
	}
	Final(){
		this.FRUIT2 = "딸기";
	}
}

//==================================================
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 10;//상수화. 값변경 불가.
		//AGE++; - error
		System.out.println("AGE = " + AGE);
		
		//garbage값 갖고 잇을때는 한 번 다시 선언할 기회가 존재.
		final int AGE2;
		AGE2 = 20;
		System.out.println("AGE2 = " + AGE2);
		System.out.println();
		
		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT);
		System.out.println("FRUIT2 = " + f.FRUIT2);
		System.out.println();
		
		System.out.println("ANIMAL = " + f.ANIMAL);
		System.out.println("ANIMAL2 = " + f.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = " + Color.RED);
		System.out.println("빨강 = " + Color.RED.ordinal());
		System.out.println();
		
		for(Color data : Color.values()) {
			System.out.println(data);
			System.out.println(data.ordinal());
		}
	}

}
