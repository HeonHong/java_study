package operator;

import java.util.Scanner;

public class Home2 {

	public static void main(String[] args) {
		char input, result;
		Scanner scan = new Scanner(System.in);
		char input1;
		String result1;
		
		
		System.out.print("알파벳을 입력하시오 : ");
		input = scan.next().charAt(0);
		result = input >=65 && input<96 ? (char)(input + 32) : (char)(input -32);
		System.out.println(input + "------->> " + result);
		
		
	}
}


/*

char ch = 'B';

int result = ch>= 'A' && ch<='Z' ? ch+32 : ch-32;
//굳이 조건 연산자에서 (char)처리를 다 할 필요 없이 결과값 출력 시에 작성하면 코드 길이를 줄일 수 있다.
system.outprintln(ch + " > " + (char)result);


*/