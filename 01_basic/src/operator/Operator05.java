package operator;

public class Operator05 {

	public static void main(String[] args) {

		int num1 = 0 , num2 = 0;
		boolean result;
		
		result = ((num1+=10) <0 && (num2+=10) > 0);
		System.out.println("result : " + result);
		System.out.println("num1 = " + num1 + "\tnum2 = " + num2 );//10 0
		System.out.println();
		
		result = ((num1+=10) > 0 || (num2+=10)>0 );
		System.out.println("result : " + result);
		System.out.println("num1 = " + num1 + "\tnum2 = " + num2 );//20 0
	}

}
