package method;

public class Method01 {//클래스에서 메소드를 뽑아서 사용한다.

	public static void main(String[] args) {
		int a =25;
		int b =36;
		
		Method01 m = new Method01();
		int sum = m.sum2(a, b);
		int sub = m.sub2(a, b);
		int mul = m.mul2(a,b);
		double div = m.div2(a,b);
		
		System.out.println(a + " + " + b + "=  " + sum);
		System.out.println(a + " - " + b + "=  " + sub);
		System.out.println(a + " * " + b + "=  " + mul);
		System.out.println(a + " / " + b + "=  " + String.format("%.2f", div));

	}




//함수는 함수 안에 작성하면 안되고 무조건 밖에 작성해야한다.

	public int sum2(int a, int b){//구현하는 줄. int부분은 리턴타입. static이 없어서 new로 객체를 생성해줘야함.
								 //(int a, int b)는 인수(argument), 매겨변수(parameter)라고 한다.
								 //인수는 한꺼번에 선언 불가능. ex(int a,b) 
	 return a+b;	
	}
	
	public int sub2(int a, int b) {
		
		return a-b;
	}
	
	public int mul2(int a, int b) {
		
		return a*b;
	}
	public double div2(double a, double b) {
	
		return a/b;
}

	
	
	
}