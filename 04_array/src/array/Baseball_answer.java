package array;

import java.util.Scanner;

public class Baseball_answer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		String yn;
		String str;
		int strike=0, ball=0;

		while(true) {
			System.out.print("게임을 실행하시겠습니까?(Y/N) : " );
			yn = scan.next();
			if(yn.equals("y")||yn.equals("Y")||yn.equals("n")||yn.equals("N")) break;
		}//while
		
		if(yn.equals("y")||yn.equals("Y")){
			System.out.println("게임을 시작합니다.");
			
			//난수발생
			for(int i=0;i<com.length;i++) {
				com[i] = (int)(Math.random()*9+1);
				for(int j=0; j<i;j++) {
					if(com[i] ==com[j]) {
						i--;
						break;
					}
				}//for j
			}//for i
			System.out.println(com[0] + ""+ com[1] +"" + com[2]);
			
			//사용자 입력
			while(true) {
				System.out.println("숫자 입력 : ");
				str = scan.next();
				for(int i=0;i<str.length();i++) {
					user[i] = str.charAt(i)-48;
				}//for i

				//char확인 방법 System.out.println(user[0] + "" + user[1] + "" + user[2]);
				
				//비교
				for(int i=0; i<com.length;i++) {
					for(int j=0; j<user.length;j++) {
						if(com[i] == user[j]) {
							if(i==j) strike++;
							else ball++;
							
						}//if
					}//forj
				}//fori
				System.out.println(strike + "스트라이크" + ball + "볼");
				//user[0] =str.charAt(0);
				//user[1] =str.charAt(1);
				//user[2] =str.charAt(2);
				if(strike ==3) break;
			}
			
			
		}//if
		
		System.out.println("프로그램을 종료합니다.");
	}

}
