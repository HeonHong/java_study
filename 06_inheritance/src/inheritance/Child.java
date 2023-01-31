package inheritance;

public class Child extends Super{

	protected String name;
	protected int age;
	
	public Child(){
		System.out.println("Child 기본 생성자");
	}
	
	public Child(String name, int age, double weight, double height) {
		System.out.println("Child 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;//this.weight = weight; this나 super는 맘대로 사용 가능하다.
		this.height = height;
		
	}
	
	public void disp() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	
	public static void main(String[] args) {
		Child aa = new Child("홍길동", 25, 70.5, 183);
		aa.disp();
		System.out.println();
		
		System.out.println("---------------------------------");
		
		Super bb = new Child("코난",13,35.6,152.7);
		bb.disp();//이름이 동일한 메소드가 2개이면 override가 되어서 자식 클래스의 메소드를 사용 

	}

}
