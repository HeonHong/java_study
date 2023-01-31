package class2;

import java.util.Scanner;

public class StringMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String inputStr, targetStr, changeStr;
		
		System.out.print("문자열 입력 : ");
		inputStr = scan.next();
		System.out.print("현재 문자열 입력 : ");
		targetStr = scan.next();
		System.out.print("바꿀 문자열 입력 : ");
		changeStr = scan.next();
		
		//str.indexof("문자열") 이거는 처음 나오는 인덱스 값만 출력해준다.
		//str.indexOf("문자열", 시작위치)
		//찾은 위치 + 글자수
		if(inputStr.length()<targetStr.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
		}else {
			inputStr = inputStr.toLowerCase();
			targetStr = targetStr.toLowerCase();
		}
		
		int count = 0;
		int index = 0;
			
		while( (index=inputStr.indexOf(targetStr, index)) != -1) {
            count++;
            index = index + targetStr.length();
         }//while

		
		System.out.println(inputStr.replace(targetStr,changeStr));
	}

}
