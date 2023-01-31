package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		int max, min;
		
		System.out.print("배열 크기 입력 : ");
		int size = scan.nextInt();
		System.out.println();
		
		int[]ar = new int[size];
		
		for(int i = 0; i<ar.length; i++) {//ar.legth대신 size가능
			System.out.print("ar["+i+"]입력 : ");
			ar[i] = scan.nextInt();
			sum += ar[i];//합
		}
		System.out.println();
		
		
		
		for(int i = 0; i<ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
		/*for(int data : ar){
			System.out.println(data + "  ");
		}
		*/
		
		max = min = ar[0];//초기값
		for(int i=1; i<size;i++) {
			if(ar[i]>max) max = ar[i];
			if(ar[i]<min) min = ar[i];
		}
		
		/*
		 for(int data : ar) {
			if(max<data) max = data;
		}
		이것도 맞는 건데 위처럼 사용하는 이유는 효율적인 실행을 위한 것인가?
		*/
		
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최솟값 = " + min);
		//중요. max의 초기값은 ar[0]로 한다.
		

	}

}
