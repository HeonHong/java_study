package operator;

public class Operator04 {

	public static void main(String[] args) {
		int a = 5;
		a += 2;//a = a + 2;
		a *= 3;//a = a * 2
		System.out.println("a = " + a);
		
		a++;
		System.out.println("a = " + a);
		
		int b = a++;
		System.out.println("a = " + a + "\tb = " + b);
		
		int c =  ++a - b--;
		System.out.println("a = " + a + "\tb = " + b + "\tc = " + c);
		
		System.out.println("a++ = " + a++);
		System.out.println("a = " + a);
	}

}
