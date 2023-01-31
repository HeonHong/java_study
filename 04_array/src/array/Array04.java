/*
주차장 관리 프로그램
**************
   1. 입차      
   2. 출차      
   3. 리스트      
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/

package array;
import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] park = new boolean[5];
		int program, position;
		
		while(true) {
			System.out.print("메뉴 : ");
			program = scan.nextInt();
			
			if(program==1) {
				System.out.print("위치 입력 : ");
				position = scan.nextInt();
				
				if(park[(position-1)]==false) {
					//boolean형은 참거짓이 이미 정해진거라 굳이 등호 사용할 필요 없음.
					//이러면 헷갈려서 실무에서 선호하지 않음.
					System.out.println(position + "위치에 입차");
					park[(position-1)]=true;
				}else
					System.out.println("이미 주차되었습니다.");
					System.out.println();
			}//if1
			
			else if(program==2){
				System.out.print("위치 입력 : ");
				position = scan.nextInt();
				
				if(park[(position-1)]==false) {
					System.out.println("주차되어있지 않습니다.");
				}else {
					System.out.println(position + "위치에 출차");
					park[(position-1)]=false;
				}
				System.out.println();
			}//if2
			
			else if(program==3){
				for(int i=0;i<5;i++) {
					System.out.println((i+1) + "위치 : " + park[i]);
				}
				System.out.println();
			}//if3
			
			else if(program==4) {
				break;
			}//if4
		}
		
		

	}

}
