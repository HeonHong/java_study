package variable;

import java.text.DecimalFormat;

public class CalcTest {

	public static void main(String[] args) {

		int a =320, b =258, sum = a+b;
		short c = 320;
		short d = 258; 
		short sum2 = (short)(c + d);
		char e = 'a';
		char f = 'b';
		int sum3 = e + f;
		int sub = a - b;
		int mul = a*b;
		int div = (int)(a/b);
		double div2 = a/b;
		//자료형은 달라도 되지만 왼쪽이 더 크기만 하면 된다. 단, 결과값은 정수자리까지만 나온다.
		double div3 = (double)a/b;
		//강제형변환과 자동형변환을 적절하게 이용해야한다.
		
		System.out.println("320 + 258 = " + sum);
		System.out.println(e + "\t" );
		System.out.println();
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " / " + b + " = " + div2);
		System.out.println(a + " / " + b + " = " + String.format("%7.5f",div3));
		System.out.println(a + " / " + b + " = " + String.format("7.5f",div3));//이렇게 치면 안 된다.
		System.out.println();
		
		
		System.out.println("e + f = " + e + f);
	}

}

/*
[문제] 변수를 이용하여 320*258의 합(sum),차(sub),곱(mul),몫(div)을 구하시오.

[실행결과]
320 + 258 = XXX
320 - 258 = XXX
320 * 258 = XXX
320 / 258 = XXX
*/