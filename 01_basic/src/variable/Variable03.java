package variable;

import java.util.Random;

public class Variable03 {

	public static void main(String[] args) {
		System.out.println("큰 값 = " + Math.max(25,36));//함수 호출해서 구현
		System.out.println("큰 값 = " + Math.max(78.9,55.8));
		System.out.println();
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*(26)+65));
		System.out.println((char)(Math.random()*(26)+65));
		
		Random r = new Random();
		double s = r.nextDouble()*26+65;
		System.out.println(s);
	}

}

/* 
난수 
- 컴퓨터가 불규칙하게 발생하는 수
- 0 <= 난수 <1
- a ~ b 사이의 난수 발생 => (int)(Math.random()*(b-a+1)+a)
 */
