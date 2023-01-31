package switch_;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("월 입력 : " );
		int month = scan.nextInt();
		int days;
		
		switch(month) {
		case 1 :
			days = 31;
			break;
		
		case 2 :
			days = 28;
			break;
			
		case 3 :
			days = 31;
			break;
			
		case 4 :
			days = 30;
			break;
			
		case 5 :
			days = 31;
			break;
			
		case 6 :
			days = 30;
			break;
			
		case 7 :
			days = 31;
			break;
			
		case 8 :
			days = 31;
			break;
			
		case 9 :
			days = 30;
			break;
			
		case 10 :
			days = 31;
			break;
			
		case 11 :
			days = 30;
			break;
			
		case 12 :
			days = 31;
			break;
			
		default : days=0;
		}
		
		System.out.println(month + "월은 " + days + "일 입니다.");
		
		
		switch(month) {
		case 1 :
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		
		case 2 :
			days = 28;
			break;
			
		case 4 :
		case 6 :
		case 9 :
		case 11:
			days = 30;
			break;
			
		default : days=0;
		}
		System.out.println(month + "월은 " + days + "일 입니다.");
		
		
	}

}
/*
 [문제]2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오

[실행결과]
a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : +

25 + 36 = xx

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : /

25 / 36 = 0.6944444444444444

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : #

연산자 error*/
