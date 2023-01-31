package array;

public class Array01 {

	public static void main(String[] args) {
		int[] ar;//배열 선언
		ar = new int[5];//생성
		ar[0]=25;
		ar[1]=78;
		ar[2]=30;
		ar[3]=43;
		ar[4]=52;
		
		System.out.println("ar[0] = " + ar[0]);
		System.out.println("ar[1] = " + ar[1]);
		System.out.println("ar[2] = " + ar[2]);
		System.out.println("ar[3] = " + ar[3]);
		System.out.println("ar[4] = " + ar[4]);
		
		System.out.println();
		
		for(int i=0;i<5;i++) {
			System.out.println("ar[" + i + "] = " + ar[i] );
		}//for
		System.out.println();

		System.out.println("배열명 ar = " + ar);
		System.out.println("배열크기 ar = " + ar.length);
		System.out.println();
		
		System.out.println("거꾸로 출력");
		for(int i= ar.length-1;i>=0;i--) {
			System.out.println("ar[" + i + "] = " + ar[i] );
		}//for
		System.out.println();
		
		System.out.println("짝수인 데이터 출력");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
			System.out.println("ar[" + i + "] = " + ar[i] );
		}//for
		System.out.println();
		
		System.out.println("확장 for문");
		for(int data : ar) {
			System.out.println(data);
		}
	}

}
