package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	Scanner scan = new Scanner(System.in);
	private int x,y;
	
	
	public void input() {
	System.out.print("x입력 : ");
	x = scan.nextInt();
	System.out.print("y입력 : ");
	y = scan.nextInt();
	
	
	
	}
	
	public void output() {
		if(y>=0) {
			int mul = 1;
			for(int i=0;i<y;i++) {
				mul*=x;
			}
			System.out.println(x + "의 " + y + "승은 " + mul);		
		}else {
			//System.out.println("y는 0보다 크거나 같아야 한다.");
			try {
				//개발자가 강제로 Exception을 발생시킨다.
				throw new Exception("y는 0보다 크거나 같아야 한다.");
			} catch (Exception e) {
			e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();
		
	}
}
