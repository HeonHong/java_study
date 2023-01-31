package nested;

public class Outer {

	private String name;
	
	public void output() {
		Inner in = new Inner();
		System.out.println("이름 = " + name + "\t나이 = " + in.age);
	}
	class Inner{
		
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + name + "\t나이 = " + age);
			//							Outer.this.name의 생략
		}
		
		
	}
	public static void main(String[] args) {
		Outer ou = new Outer();//Inner 클래스에는 접근 불가능하다. 별도의 클래스이기때문인다.
		ou.name = "홍길동";//된다. private이라도 같은 클래스라서
		ou.output();
		//질문. output의 나이를 변경하는 방법 확인하기.
		
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();
		in3.age = 30;
		in3.disp();
		//나이 설정 in3.name 설정 불가. 왜냐면 이건 아예 다른 클래스니까.
		//inner와 outer의 관계는 정의가 된 클래스 내에서만 이동이 가능하다.
		System.out.println();
		
		Outer.Inner in4 = new Outer().new Inner();
		in4.age = 35;
		//in4.name = "코난" 불가.
		in4.disp();
		
		
		//질문. OUTER에 직접 접근하는 방법 선언하기
		Outer ou2 = new Outer();
		Outer.Inner in5 = ou2.new Inner();
	}

}
