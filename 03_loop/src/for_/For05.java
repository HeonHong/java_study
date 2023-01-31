package for_;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		int x, y, result = 1 ;
		Scanner scan = new Scanner(System.in);
		System.out.print("x : ");
		x = scan.nextInt();
		System.out.print("y : ");
		y = scan.nextInt();
		
		for(int i=1;i<=y;i++) {
			result *= x; 
		}//for
		
		System.out.println(x + "의 " + y + "승  " + result);
		
		

	}

}


/*
[문제] x의 y승을 구하시오 (for)

[실행결과]
x : 2
y : 5
2의 5승 xx (2*2*2*2*2)
---------------------------
x : 3
y : 4
3의 4승 xx (3*3*3*3)
*/