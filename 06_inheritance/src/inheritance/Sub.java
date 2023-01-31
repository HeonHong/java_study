package inheritance;

public class Sub extends Super {
	//그냥 바로 public class Sub extends Super 이렇게 쓰면 에러. 왜냐하면 Super class에 생성자 만들어놨기 때문에. 이럴 경우 디폴트 생성자 만들어준다.
	//부모 클래스에 생성자가 없을 경우, 자식 클래스는 만들때 자신의 생성자와 부모의 생성자를 동시에 만들기 때문에 기본생성자가 2개 생긴다.
	
	protected String name;
	protected int age;
	
	public Sub(){
		System.out.println("Sub 기본 생성자");
	}
	
	public Sub(String name, int age, double weight, double height) {
		System.out.println("Sub 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;//this.weight = weight; this나 super는 맘대로 사용 가능하다.
		this.height = height;
		//질문. 그러면 데이터가 Super&Sub 둘 다에 저장이 되는건가?
		//아니다 하나에 저장된다고 생각하면되고 가끔 꼭 Super.을 이용해야하는 경우도 있지만 거의 동일한 개념이다.
	}
	
	@Override
	public void disp() {
		System.out.println("이건 sub");
	}
	
	public void output() {
		
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	
	public static void main(String[] args) {
		Sub aa = new Sub("홍길동", 25, 70.5, 183);
		aa.disp();
		System.out.println();
		aa.output();
		System.out.println("---------------------------------");
		
		Super bb = new Sub("코난",13,35.6,152.7);//추상클래스 개념? super 객체값 참조. 따라서 output()호출 불가해진다.
		//질문. 그러면 여기서 sub의 의미는?
		//Super는 타입인거고 Sub는 객체를 생성하는거다. bb는 그냥 리모컨인거다.
		//bb는 뭐라고 부르는지?
		bb.disp();
	}

}
