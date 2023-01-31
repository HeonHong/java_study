package method;

public class Method02 {

	public void disp() {//구현
		System.out.println("non-static method");
	}
	
	public static void output() {//구현. static은 JVM이 main함수를 부르면서 자동으로 올라간다.
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		Method02.output();//호출
		output();//자기 구역이라 굳이 Method2를 언급할 필요 없다.
		
		Method02 di = new Method02();//생성자 조심할 것
		di.disp();//생성자 조심할 것
	}
}
