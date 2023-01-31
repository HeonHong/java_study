package class2;

class StaticTest{
	private int a;//필드. new 할때까지 생성x. 인스턴스 변수
	private static int b;//필드. main 처음부터 자동생성. 클래스 변수
	
	static {
		System.out.println("초기화영역");
		b =7;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a=7;
		//b는 생성자 초기화 불가. 생성자를 부르기 전보다 main이 static을 더 먼저 만들기 때문에.
		//static초기화느 별도
	}
	
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a=" + a + "\t b=" + b);
	}//this.a에서 this생략. StaticTest.b에서 StaticTest생략
	
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a=" + a + "\t b=" + b);
		//내 클래스에 있는 것이 아니라서 a가 오류뜬다. a의 this는 바깥 클래스용이다.
		//static내에는 무조건 static변수만 사용이 가능하니다.
	
	}
}
//=================================================================
public class StaticMain {

	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		StaticTest.output();//클래스명.메소드()가능. static이라서
		//객체.메소드()도 가능
		
	}

}
