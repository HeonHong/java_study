package variable;

import java.util.Random;
public class Variable04 {

	public static void main(String[] args) {
		int a;//정수형 변수. 지역변수. 쓰레기값
		a = 10;
		
		Random r = new Random();
		//클래스형 변수 = 객체
		
		System.out.println("변수 a = " + a);
		System.out.println("객체 r = " + r);
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(26) + 65);
		System.out.println(new Random().nextDouble());
		//마지막 줄은 주소도 모르고 그냥 일회성으로 사용하는 기능이다. 왜냐면 변수에 저장을 안해놨으니까.
		System.out.println();
		
		String b = new String("사과");
		String c = "딸기";
		//문자열 literal 생성. String은 클래스이기때문에 new String을 안해도 주소를 가지고 있다.
		//다만 원래는 lang이건 util이건 new class를 해줘야하나 String class 만 특이 케이스이다.
		System.out.println(b + "\t" + c);

		
	}

}
