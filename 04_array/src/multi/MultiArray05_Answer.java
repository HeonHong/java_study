package multi;

import java.util.Scanner;

public class MultiArray05_Answer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt;
		int subjectCnt;
		String[][] subject;
		int[][] score;
		int[] sum;
		double[] avg;
		
		System.out.print("인원수 입력 : ");
		cnt = scan.nextInt();
		String[] name = new String[cnt];
		subject = new String[cnt][] ;
		score = new int[cnt][];
		avg = new double[cnt];
		
		
		//입력
		for(int i=0;i<cnt;i++) {
			System.out.print("이름입력 : ");
			name[i] = scan.next();
		
			System.out.print("과목수 입력 : ");
			subjectCnt = scan.nextInt();
			
			subject[i] = new String[subjectCnt];
			for(int j=0;j<subjectCnt;j++) {
				System.out.print("과목을 입력하세요 : ");
				subject[i][j] = scan.next();
			}//forj
				
			score[i] = new int[subjectCnt+1];//선생님은 총점을 위해서 +1을 하심.
			for(int j=0;j<subjectCnt;j++) {
				System.out.print(subject[i][j] + " 점수를 입력하세요 : ");//내 코드에선 이 부분 놓쳤음
				score[i][j] = scan.nextInt();
				score[i][subjectCnt] += score[i][j];//점수 더하는 방식 참고!!!
			}//forj
			
			avg[i] = (double)score[i][subjectCnt]/(subjectCnt);//평균낼 때 조심할 것.
			System.out.println("-----------------------------------------------------------------------------------------");
		}//fori

		for(int i=0;i<cnt;i++) {
			//제목
			System.out.print("이름\t");
			for(int j=0;j<subject[i].length;j++) {
				System.out.print(subject[i][j] + "\t");
			}
			System.out.println("총점\t평균");
			
			//데이터
			System.out.print(name[i] + "\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(String.format("%.2f",avg[i]));
		}
		
		//출력
	}
	
}
