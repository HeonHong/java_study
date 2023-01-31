package for_;

public class MultiFor04_Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan, i, w;
		
		for(w=2; w<=8; w+=3) {//w는 3번 반복하게만 만들면 된다
			
			//=========================================반복되는 시점========================================
			for(i=1; i<=9; i++) {
				for(dan=w; dan<=w+2; dan++) {
					
					if(dan!=10)System.out.print(dan + "*" + i + "=" + dan*i + "\t");
					//참고!! 내 코드랑 다름!
					
				}//for dan
				System.out.println();
			}//for i
			//=========================================반복되는 시점 끝 ========================================
			
		}
		
	 

	}
}
