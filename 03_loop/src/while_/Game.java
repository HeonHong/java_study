/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (77)

숫자 입력 : 50
50보다 큰 숫자입니다
숫자 입력 : 80
80보다 작은 숫자입니다.
~
~
숫자 입력 : 77
딩동뎅...x번만에 맞추셨습니다.
 */

package while_;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int com = r.nextInt(100) + 1;
			int count = 0, user;
			
			System.out.println("1~100 사이의 숫자를 맞추세요." + com);
			
			while(true) {
					System.out.print("숫자 입력 : ");
					user = scan.nextInt();
					count++;
					
					if(user == com) {
						System.out.println("딩동댕! " + count +"번만에 맞추셨습니다.");
						break;
					}else if(user>com) {
						System.out.println(user + "보다 작은 숫자입니다.");
					}else {
						System.out.println(user + "보다 큰 숫자입니다.");
					}
						
				}//while
				//선생님은 if user==com인 경우 바로 break 걸고 프린트를 밖에 하셨다.
			
		System.out.print("\n한 판 더할래요?(Y/N)");
		
		String yn = scan.next();
		if(yn.equals("N") || yn.equals("n"))break;//yn=="n"이런 식으로 치면 절대 인식 못 함.
		
			
		}//while밖
		System.out.println("프로그램 종료합니다.");
	}

}

//게임 재진행을 하려면 com의 값이 다시 잡히는 순간부터 while문을 걸어주면 된다.