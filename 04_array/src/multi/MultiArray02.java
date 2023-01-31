package multi;

public class MultiArray02 {

	public static void main(String[] args) {
	
		int[][] ar= new int[10][10];
		
		int num=0;
		
		//입력
		for(int i =0;i<ar.length;i++) {
			for(int j =0;j<ar[i].length;j++) {
				num++;
				ar[i][j] = num;
			}//forj
		}//fori

		//출력
		for(int i =0;i<ar.length;i++) {
			for(int j =0;j<ar[i].length;j++) {
				System.out.print(String.format("%-4d", ar[i][j]) );
			}//forj
			System.out.println();
		}//fori
		
		System.out.println();
		
		//입력
		num = 0;
		for(int i =0;i<ar.length;i++) {
			for(int j =0;j<ar[i].length;j++) {
				num++;
				ar[j][i] = num;
			}//forj
		}//fori
		
		//출력
		for(int i =0;i<ar.length;i++) {
			for(int j =0;j<ar[i].length;j++) {
				System.out.print(String.format("%-4d", ar[i][j]) );
			}//forj
			System.out.println();
		}//fori
	
		
		System.out.println();
		
		//입력
		num = 100;
		for(int i =0;i<ar.length;i++) {
			for(int j =0;j<ar[i].length;j++) {
				ar[i][j] = num;
				num--;
			}//forj
		}//fori
		
		//출력
		for(int i =0;i<ar.length;i++) {
			for(int j =0;j<ar[i].length;j++) {
				System.out.print(String.format("%-4d", ar[i][j]) );
			}//forj
			System.out.println();
		}//fori
		
		System.out.println();
		
		
		//입력(선생님 방식)(확인요)
		num = 100;
		for(int i =ar.length-1;i>=0;i++) {
			for(int j =ar.length-1;j>=0;j++) {
				num++;
				ar[i][j] = num;
				
			}//forj
		}//fori
		
		//출력
		for(int i =0;i<ar.length;i++) {
			for(int j =0;j<ar[i].length;j++) {
				System.out.print(String.format("%-4d", ar[i][j]) );
			}//forj
			System.out.println();
		}//fori
		
	}

}
