package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 : " );
		a = scan.nextInt();
		System.out.print("b의 값 : " );
		b = scan.nextInt();
		System.out.print("c의 값 : " );
		c = scan.nextInt();
		
		if(a<=b && a<=c){//a가 가장 작은 경우
			
			if(b<=c) System.out.println(a + "," + b + "," + c);
			else System.out.println(a + "," + c + "," + b);
			
		}else if(b<=c) {//b가 가장 작은 경우
			
			if(a<=c) System.out.println(b + "," + a + "," + c);
			else System.out.println(b + "," + c + "," + a);
			
		}else {//c가 가장 작은 경우
		
			if(a<=b) System.out.println(c + "," + a + "," + b);
			else System.out.println(c + "," + b + "," + a);
			
	}

	}
}


/* 3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85
합격


a의 값 : 98
b의 값 : 90
c의 값 : 35
과락으로 불합격


a의 값 : 68
b의 값 : 50
c의 값 : 45
불합격*/
