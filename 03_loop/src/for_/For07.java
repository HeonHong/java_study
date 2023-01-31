package for_;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		
		int i, mul = 1;
		long num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력 : " );
		num = scan.nextInt();
		
		for(i = 1;i<=num;i++) {
			mul *= i;
		}
		System.out.print(num + "! = " + mul + "(");
		
		for(i = 1;i<num;i++) {
			System.out.print(i + "*");
		}
		System.out.print(num + ")");
		
		
		
		
		
		
		
		/*
		
		for(i = 1;i<=num;i++) {
			System.out.print(i);
			if(i<num)
				System.out.print("*");
		}
		System.out.println(")");
	
	*/
	
		
		
	
	}

}

/*
[문제] 팩토리얼을 구하시오 (for)
- 입력되는 숫자는 1 ~ 10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
-------------------------
숫자 입력 : 9
9! = 362880 (1*2*3*...*9)
*/