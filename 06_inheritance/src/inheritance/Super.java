package inheritance;

public class Super {//부모클래스는 void main 없다.

	protected double weight, height;
	
	//질문.protected double weight, height; 이 필드들에 외부에서 들어올 수 없으니까. 그러면 자식 클래스도 생성자 없이는 못 들어 오는 건가?
	//ㄴㄴ 들어올 수 있음.
	//생성자
	
	public Super(){
		System.out.println("Super 기본 생성자");
	}
	
	public Super(double weight, double height) {//괄호 안에 있는 것을 인수(argument)라고 한다.
		System.out.println("Super 생성자");
		this.weight = weight;
		this.height = height;
	}
	
	//메소드
	
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키    = " + height);
	}

	
}
