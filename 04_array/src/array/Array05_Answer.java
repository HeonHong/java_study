package array;

import java.util.Random;

public class Array05_Answer {

	public static void main(String[] args) {

		Random r = new Random();
		char[] ar = new char[50];
		int[] count = new int[26];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] =(char)(r.nextInt(26) + 65);//65~90사이 난수
			System.out.print(ar[i] + " ");
			if((i+1)%10==0)
				System.out.println();
		}//for i
		
		for(int i=0; i<ar.length;i++) {
			for(int j=0; j<count.length; j++) {
				if(ar[i]==j+65) count[j]++;
			}//for j
		}//for i
		
		for(int i=0; i<count.length; i++) {
			System.out.println((char)(i+65) + " : " + count[i]);
		}
		
	}

}

/*
 ========이중for문 해석==========
if(ar[0]=='A')count[0]++;
else if(ar[0]=='B')count[1]++;
else if(ar[0]=='C')count[2]++;
:
:
else if(ar[0]=='Z')count[25]++;

if(ar[1]=='A')count[0]++;
else if(ar[1]=='B')count[1]++;
else if(ar[1]=='C')count[2]++;
:
:
else if(ar[1]=='Z')count[25]++;

자주 바뀌면 분,가끔 바뀌는 게 시

이 문제는 AI가 기본적으로 돌아가게 단어 사용량 같은 거 찾는 프로그램의 기본 코드인거다.
*/