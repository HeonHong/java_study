package operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = a/3;//답 : 24. 정수형 나누기 정수형이기 때문에. Casting(강제형변환) int a > double a
		
		String c = "25";
		int d = Integer.parseInt(c);// int d = (int)c 객체형이기 때문에 기본형으로 캐스팅 불가. 같은 타입의 wrapper class내의 method를 불러와야한다.
		
		//Autoboxing(jdk 5.0부터)
		int e = 5;
		Integer f = e;// 위 String은 다른 계열이 아니기 때문에 autoboxing이 불가해 메소드가 필요했지만 이 경우는 같은 걔열이라 autoboxing
		//Integer g = new Integer(e); // Jdk 5.0이전
		
		Integer h = 5;
		int i = h ;//unAutoboxing
		//int j = h.intValue();//JDK5.0 이전
	}

}
