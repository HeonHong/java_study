package for_;

import java.util.Scanner;

public class AddGame_Answer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, dab, count = 0;
		String yn;
		
		while(true) {
			
			for(int i =1 ; i<=5 ; i++) {
				//-------------------------------반복되는 시점-----------------------------------------------------------
				a = (int)(Math.random()*90 + 1);//99-10+1
				b = (int)(Math.random()*90 + 1);//99-10+1
				
				//------------------------문제를 2번 푸는 시점----------------------------
				for(int j=1;j<=2;j++) {
					System.out.print("[" + i + "]" + a+" + " + b + " = ");
					dab = scan.nextInt();
					
					
					if(dab == a+b) {
						System.out.println("정답입니다.");
						count++;
						break;//for j를 벗어나라
					}else {
						if(j==1)
							System.out.println("틀렸다");
						else
							System.out.println("틀랬다 정답은 " + (a+b));
					}
						
				}//for j
				System.out.println();
				//------------------------문제를 2번 푸는 시점 끝----------------------------
				//---------------------------------------------------------------------------------------------
			}//for i
			System.out.println("당신은 총 " + count + "문제 맞춰서 " + count*20 +"점입니다.");
			
			do {
				System.out.print("또 할래?(Y/N) : ");
				yn = scan.next();
			}while(!yn.equals("y")&&!yn.equals("Y")&&!yn.equals("N")&&!yn.equals("n"));//do~while
			//중요!!!! 여기서 &&연산자 써야하는 거다.
			
			if(yn.equals("N")||yn.equals("n")) break;//while을 벗어나라.
			System.out.println();
			
		}//while
		System.out.println("프로그램을 종료합니다.");
	}

}
