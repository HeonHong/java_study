package operator;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시요 : ");
		int input = scan.nextInt();
		int even = input%2;
		int odd = input%3;
		
		String result1 = even == 0? "짝수" : "홀수";
		System.out.println(input + "는 " + result1 );
		
		String result2 = even==0 && odd==0 ? "2와 3의 공배수이다" : "2와 3의 공배수가 아니다";
		System.out.println(input + "는 " + result2);
		//System.out.println(input + "는 2와 3의 " + (input%2==&&input%3 ? "공배수이다" : "공배수 아니다"));
	}

}

/*
[문제] 정수를 입력하여 짝수? 홀수?, 2와 3의 공배수이냥? 아니냥?
 
[실행결과]
정수 입력하시오 : 12
12는 짝수
12는 2와 3의 공배수이다
*/