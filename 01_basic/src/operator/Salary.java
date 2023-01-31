package operator;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		int basePay, extraPay, sum, salary, tax;
		double rate;
		String name, position;

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("직급 입력 : ");
		position = scan.next();
		System.out.print("기본급 입력 : ");
		basePay = scan.nextInt();
		System.out.print("수당 입력 : ");
		extraPay = scan.nextInt();
		System.out.println();
		
		sum = basePay + extraPay;
		rate = sum >=5000000 ? 0.03 : (sum >= 3000000 ? 0.02 : 0.01);
		tax = (int)(sum * rate);
		salary = sum - tax;
	
		System.out.println("*** " + name + " " + position + " 월급***");
		System.out.println("기본급 : " + basePay );
		System.out.println("수당 : " + extraPay);
		System.out.println("합계 : " + sum);
		System.out.println("세금 : " + tax);
		System.out.println("월급 : " + salary);
		
		/*
		int basePay, extraPay, sum, salary, tax;
		double rate1, rate2, rate3;
		String name, position;

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("직급 입력 : ");
		position = scan.next();
		System.out.print("기본급 입력 : ");
		basePay = scan.nextInt();
		System.out.print("수당 입력 : ");
		extraPay = scan.nextInt();
		
		
		sum = basePay + extraPay;
		rate1 = sum>=5000000 ? 0.03 : 0.02;
		rate2 = rate1==0.02 && sum>=3000000 ? 0.02 : 0.01;
		rate3 = rate1==0.03 ? rate1 : rate2;
		tax = (int)(rate3 * sum);
		salary = sum - tax;
		
		System.out.println();
		
		System.out.println("*** " + name + " " + position + " 월급 ***");
		System.out.println("기본급 : " + basePay);
		System.out.println("수당 : " + extraPay);
		System.out.println("합계 : " + sum);
		System.out.println("세금 : " + tax);
		System.out.println("월급 : " + salary);
		*/
		
	}

}

/*
[문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 합계, 세율, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 
월급 : 
*/