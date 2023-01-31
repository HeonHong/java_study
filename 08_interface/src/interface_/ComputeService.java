package interface_;

import java.util.Scanner;

public class ComputeService {

	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		Compute compute=null; //중요
		
		while(true) {
			//부모는 자식을 참조할 수 있다.
			System.out.println("*************");
			System.out.println("****1.가입****");
			System.out.println("****2.출력****");
			System.out.println("****3.수정****");
			System.out.println("****4.탈퇴****");
			System.out.println("****5.끝내기***");
			System.out.println("*************");
			System.out.print("번호 : ");
			num = scan.nextInt();
			
			
			if(num==5) break;
			if(num==1)//sum클래스의 disp()호출;
				compute = new Sum();
			else if(num==2)//sub클래스의 disp()호출; 부모 = 자식(다형성)
				compute = new Sub();
			else if(num==3)//mul클래스의 disp()호출;
				compute = new Mul();
			else if(num==4)//sub클래스의 disp()호출;
				compute = new div();
					
			
				compute.disp();
				
		}//while
		
		
	}
	
}
