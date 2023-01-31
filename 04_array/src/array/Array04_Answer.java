package array;

import java.util.Scanner;

public class Array04_Answer {

	public static void main(String[] args) {
		boolean[] ar = new boolean[5];
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			
			System.out.println("주차관리 시스템");
			System.out.println("**********");
			System.out.println("  1. 입차");
			System.out.println("  2. 출차");
			System.out.println("  3. 리스트");
			System.out.println("  4. 종료");
			System.out.println("**********");
			System.out.print("   메뉴 : ");
			num = scan.nextInt();
			
			
			if(num==4) break;
			if(num>4||num<1) {
				System.out.println("1~4번까지만 입력하세요");
				continue;	
			}
				
			if(num == 1) {
				System.out.print("위치 입력 : ");
				int position = scan.nextInt();
				
				if(ar[position - 1]) {
					System.out.println("이미 주차 완료");
				}else {
					ar[position-1] = true;
					System.out.println(position +"위치에 입차");
				}
				
			}else if(num ==2) {
				System.out.print("위치 입력 : ");
				int position = scan.nextInt();
				if(ar[position - 1]) {
					System.out.println(position+"위치에 출차");
				}else {
					ar[position-1] = false;
					System.out.println("주차되어있지 않습니다");
				}
				
				
			}else if(num==3) {
				for(int i=0; i<ar.length; i++ ) {
					System.out.println((i+1)+ "위치 : " + ar[i]);
				}//for
			}
			System.out.println();
		}//while
		
		
		System.out.println("프로그램을 종료합니다.");
	}

}
