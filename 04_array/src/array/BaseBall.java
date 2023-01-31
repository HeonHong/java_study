/*
야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼
*/

package array;

import java.util.Scanner;
import java.util.Random;

public class BaseBall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int input;
		String yn;
		
		int[] ar = new int[3];
		int[] num = new int[3];
		
		while(true) {
			System.out.print("게임을 실행하시겠습니까?(Y/N) ");
			yn = scan.next();
			if(yn.equals("N")||yn.equals("n")) break;
			else if(!yn.equals("y")&&!yn.equals("Y")) continue;
			
			System.out.println("게임을 시작합니다.");
			
			for(int i=0;i<ar.length;i++) {
				
				ar[i] = r.nextInt(9)+1;
				for(int j=0;j<i;j++) {
					if(ar[i]==ar[j]) {
						i--;
						break;
					}//if
				}//for j
				
			}//for i
			
			/*데이터 확인용
			 for(int data:ar) {
				System.out.print(data);
			}*/
			
			System.out.println();
			
			while(true) {
				System.out.print("숫자입력 : ");
				input = scan.nextInt();
				
				int strike =0;
				int ball = 0;
				
				num[0] = (int)(input/100);
				num[1] = (int)(input%100/10);
				num[2] = (int)(input%10/1);
				
				/*for(i=2;i=<0;i--){
				 num[i]=input%10;
				 input/=10
				 }
				*/
				for(int i=0;i<ar.length;i++) {
					for(int j=0;j<num.length;j++) {
						if(ar[i] == num[j]) {
							if(i==j) strike++;
							else ball++;
						}//if		
					}//forj
				}//fori
				
				System.out.println(strike + "스트라이크" + ball + "볼");
				if(strike==3) break;
			
		}//최종while
		System.out.println();
		
		}System.out.println("프로그램을 종료합니다.");
	}

}


