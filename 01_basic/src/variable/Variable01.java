package variable;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		boolean a;
		a = false;//대입문. 등호는 오른쪽에 있는 값을 왼쪽으로 대입을 의미. 0 - false/ 1 - true
		System.out.println("a = " + a);
		
		char b = 'A'; //2바이트 = 16비트
	    System.out.println("b = " + b);
	    
	    char c = 65535; // ~65535. 이후부터는 int형으로 인식시켜줘야한다.
	    System.out.println("c = " + c);
	    
	    //byte d = 128; -error(cannot cover from int to byte)
	    byte d = 127;//최소 정수 단위. 128부터는 int형으로 취급
	    System.out.println("d = " + d);
	    
	    int e = 65;//char와 차이점. 메모리 크기. 출력 형태
	    System.out.println("e = " + e);
	    
	    int f = 'A';
	    System.out.println("f = " + f); //65로 출력. 0x41, A 다 같은 값이다.
	    
	    long g = 65L;//L은 long형 상수
	    System.out.println("g = " + g);
	    
	    long h = 65;//이렇게 잡아도 잡히긴 한다. 왜냐하면 long이 int보다 크니까.
	    System.out.println("h = " + h);
	    
	    float i = 43.8f;
	    System.out.println("i = " + i);
	    //float i = (float)43.8 강제 형변환(Cast 연산)
	    //float i = 43.8; cannot convert from double to float
	    //43.8은 double형이 default이기 때문에 f를 붙여줘야한다. double값을 float에 대입불가

	}

}
