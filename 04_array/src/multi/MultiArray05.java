/*
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름   국어  영어   과학    총점      평균
이기자   95   100      90        xxx      xx.xx
*/

package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt;
		int subInput;
		double[] avg;
		int[] sum;
		int[][] score;
		String[][] sub;
		String[] name;
		
		System.out.print("인원수 : ");
		cnt = scan.nextInt();
		name = new String[cnt];
		sum = new int[cnt];
		avg = new double[cnt];
		sub = new String[cnt][];
		score = new int[cnt][];
		//i
		for(int i=0; i<cnt; i++) {
			
			System.out.print("이름입력 : ");
			name[i]= scan.next(); 
			
					
			System.out.print("과목수 입력 : ");
			subInput = scan.nextInt();			
			sub[i] = new String[subInput];
			score[i] = new int[subInput];
			
			//j
			for(int j=0;j<subInput;j++) {
				System.out.print("과목명 입력 : ");
				sub[i][j] = scan.next();
			}//fork
			
			//k
			for(int k=0;k<subInput;k++) {
				System.out.print("점수 입력 : ");
				score[i][k] = scan.nextInt();
				sum[i] += score[i][k];
				
			}//for k
			avg[i]=(double)(sum[i])/subInput;
			System.out.println();
			
		}//fori
		
		for(int i=0;i<name.length;i++) {
			System.out.print("이름\t");
			for(int k=0; k<sub[i].length; k++) {
				System.out.print(sub[i][k] + "\t");
			}//fork
			System.out.print("총점\t평균");
			System.out.println();
			System.out.print(name[i] + "\t");
			for(int k=0; k<score[i].length; k++) {
				System.out.print(score[i][k] + "\t");
			}//fork
			System.out.println(sum[i]+"\t" + String.format("%.2f",  avg[i]));
			System.out.println();
			System.out.println();
		}//fori
		
	}
}




