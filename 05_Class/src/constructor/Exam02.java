package constructor;

import java.util.Scanner;

public class Exam02 {

	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";//상수화
	
	
	public Exam02(){
		ox = new char[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름입력 : ");
		this.name = scan.next();
		System.out.print("답입력 : ");
		this.dap = scan.next();
	}
	
	public void compare() {
		for(int i=0; i<dap.length();i++)//문자열의 크기
		if(dap.charAt(i)==JUNG.charAt(i)) {
			ox[i] = 'O';
			score+=20;
		}
		else ox[i] = 'X';
	}
	
	public String getName() {
		return name;
	}
	
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
}
