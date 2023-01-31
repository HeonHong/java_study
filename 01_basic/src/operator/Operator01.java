package operator;

import java.text.DecimalFormat;

public class Operator01 {

	public static void main(String[] args) {

		int money = 1234;
		int thous = (int)(money/1000);
		int hunds = (int)((money%1000)/100);
		int tens = (int)((money%100)/10);
		int ones = (int)(money%10);
		
		System.out.println("현금 : " + new DecimalFormat().format(money) + "원");
		System.out.println("천의 자리 : " + thous);
		System.out.println("백의 자리 : " + hunds);
		System.out.println("십의 자리 : " + tens);
		System.out.println("일의 자리 : " + ones);
	
	
	
		DecimalFormat df = new DecimalFormat();
		System.out.println("현금 : " + df.format(money) + "원");
	}

}


/*
[문제] 현금이 5738원이 있다. 각 자리별로 출력하시요.
*/