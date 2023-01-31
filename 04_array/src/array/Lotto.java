/*
[문제] 로또
- 돈을 입력받아서 난수가 자동으로 발생하는 프로그램

[실행결과]
현금 입력 : 7000
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    3   14   23   30   34   35
   18   20   25   27   32   37

    1   16   32   34   41   42
    5    6   18   30   33   44
 */


package array;

import java.util.Arrays;
import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int money;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("현금을 넣으세요 : ");
		money = scan.nextInt();
		int times = money/1000;
			
		for(int k=0;k<times;k++) {	
			for(int i=0;i<lotto.length;i++) {
				lotto[i] = (int)(Math.random()*45) + 1;
				
				//중복체크
				for(int j=0; j<i;j++) {
					if(lotto[i]==lotto[j]) {
						i--;
						break;
					}
				}//for j
				
				
			}//for i
			
			Arrays.sort(lotto);//정렬-오름차순
			
			
	
			for(int data : lotto) {
				System.out.print(String.format("%3d", data));//정수형 자릿수 맞추기 용도 (-)면 왼쪽 정렬/(+)면 오른쪽 정렬
				
			}
			System.out.println();
			if ((k+1)%5==0) System.out.println();
		}//for times
	}

}
