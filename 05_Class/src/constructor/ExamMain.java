/*
[문제] 사지선다형
- 총 5문제의 답을 입력받는다
- 정답은 "11111" 이다
- 맞으면 'O', 틀리면 'X'

클래스명 : Exam
* 필드
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111"; //상수화

* 메소드
생성자 - Scanner 쓰기
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
이름 입력 : 홍길동
답 입력 : 12311                                                                                                                                                                                                                                                                           

이름      1 2 3 4 5   점수
홍길동     O X X O O   60
 */
package constructor;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		Exam e = new Exam(scan.next());
		System.out.print("답   입력 : ");
		e.compare(scan.next());
		
		System.out.println("이름\t1 2 3 4 5\t점수");
		System.out.println(e.getName()+"\t"+e.getOx()+"\t"+e.getScore());
		
	}

}
