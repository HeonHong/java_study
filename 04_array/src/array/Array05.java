/*
[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
 */
package array;

import java.util.Random;

public class Array05 {

	public static void main(String[] args) {
		Random r = new Random();
		char[] rand = new char[50];
		char[] ar = new char[26];
		
		
		for(int i=0;i<rand.length;i++) {
			rand[i] =(char)(r.nextInt(26) + 65);//65~90사이 난수
			System.out.print(rand[i] + " ");
			if((i+1)%10==0)
				System.out.println();
		}//for i
		
		System.out.println();
		
		for(int j=0;j<26;j++) {
			
			ar[j] = (char)(65+j);
			int count = 0;
			
			for(int k=0;k<50;k++) {
				if(ar[j] == rand[k]) {
					count++;
					}
			}//for k
			
			System.out.println(ar[j]+ " : " + count + "개");
		
		}//for j
			
	}
		
		
		

}


