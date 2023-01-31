package for_;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, v, sum = 0;
		
		for(i=1; i<=10; i++) {
			if(i%2 == 1) {
				v = (-1)*i;
				System.out.print(v);}
			else {
				v = i;
				System.out.print("+" + v);}
			
			sum += v;
			
			}
		
		System.out.println(" = " + sum);
	
		
		
		int sum1 = 0;
		for(int i1=1; i1<=10; i1++) {
			if(i1%2==1) {
				sum1 -= i1;
				System.out.print("-" + i1);
				}else {
					sum1 += i1;
					System.out.print("+" + i1);
					}
		}
		System.out.println(" = " + sum1);
	}

}

/*
[문제] 결과화면과 똑같이 출력하시오 (for, if)

[실행결과]
-1+2-3+4-5+6-7+8-9+10 = 5
*/