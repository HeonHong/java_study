package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {//질문 argument를 굳이 해야하는 이유? 그리고 우리가 작성하는 코드 중 어떻게 argument 배열로 들어가는 것인지.
		
		if(args.length > 0 )System.out.println("args[0] = " + args[0]);
		System.out.println();
		
		try {
			int num = Integer.parseInt(args[0]);
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("숫자입력 : ");
			int num2= scan.nextInt();
			
			
			
			System.out.println(num+"/" +num2+"="+ (num/num2));
		}catch(NumberFormatException e) {
			System.out.println("반드시 숫자만 가능합니다.");
			e.printStackTrace();//원래 메세지 그대로 반환
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("error가 있건 없건 무조건 실행");
		}
		
	}

}
