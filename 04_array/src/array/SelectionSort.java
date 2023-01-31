package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {35,48,25,72,50};
		System.out.print("정렬전 : " );
		for(int data : ar) {
			System.out.print(data + " ");
		}
		
		for(int i=0;i<ar.length;i++){//length-1이 되어야 한다. 왜냐하면 끝 값은 어차피 밀려서 들어간 수니까 굳이 프로그램을 한 번 더 돌릴 필요가 없다.
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int change;//비유 : 우유랑 쥬스의 위치를 바꾸는 것.
					change = ar[i];
					ar[i] = ar[j];
					ar[j] = change;
				}
			}//forj
		}//fori
			
		
		/*선생님 코드
		 for(int i=0;i<ar.length-1;i++){
		 	for(int j=i+1; j<ar.length;j++){
		 	if(ar[i]>ar[j]){
		 		int temp;
		 		temp = ar[i];
		 		ar[i] = ar[j];
		 		ar[j] = temp;
		 	
		 		}if
		 	}forj
		 } fori
		 
		 */
	
		//Arrays.sort(ar);
		
		
		System.out.println();
		System.out.print("정렬후 : " );
		for(int data : ar) {
			System.out.print(data + " ");
		}

		System.out.println();
	}

}
