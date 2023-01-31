/*
[문제] 덧셈 계산 (for, while, 다중 for, if)
- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 5문제를 제공한다.
- 1문제당 점수 20점씩 처리한다.
- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.

[실행결과]
[1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 59
틀렸다 정답은 xx

[2] 10 + 25 = 35
딩동뎅

[5] 78 + 95 = 89
틀렸다
[5] 78 + 95 = 173
딩동뎅

당신은 총 x 문제를 맞추어서 점수 xx점 입니다.

또 할래(Y/N) : a
또 할래(Y/N) : n
프로그램을 종료합니다.
 */

package for_;

import java.util.Random;
import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		int user, a, b, input, sum, score = 0;

		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		LABEL : while(true) {
				for(int i=1;i<=5;i++) {
					
						a = r.nextInt(90)+10;
						b = r.nextInt(90)+10;
						sum = a + b;
					
						for(int j = 1; ;j++) {//기회를 1번 더
						System.out.print("[" + i + "]" + a+"+"+b+"=");
						input = scan.nextInt();
						if(sum == input) {
							System.out.println("딩동댕");
							score += 1;
							break;
						}else {
							if(j==2) {
								System.out.println("틀렸다. 정답은 " + sum);
								break;		
							}else System.out.println("틀렸다.");
						}
					
					}//안for
				
				}//바깥for		
				
				System.out.println("당신은 총 "+ score+"개 맞춰서 점수 " + (score*20)+"점 입니다.");
				System.out.println();
				
				while(true) {
					System.out.print("또 할래?(Y/N)");
					String acceptance = scan.next();
					if(acceptance.equals("Y")||acceptance.equals("y"))
						break;
					else if(acceptance.equals("N")||acceptance.equals("N"))
						break LABEL;
				}//아래while
				
			}//가장 바깥쪽 while
	
	}//main

}
