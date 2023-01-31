package while_;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		while(a<=10) {
			System.out.print(a +" ");	
			a++;
		}//while
		System.out.println();
	
		//1 2 3 4 5 6 7 8 9 10
		int b = 0;
		while(b<=9) {
			b++;
			System.out.print(b +" ");	
		}//while
		//while문을 확인할 때, 꼭 맨 앞값과 맨 뒷값을 잘 봐야한다.
		System.out.println();
		
		
		
		int c = 0;
		while(true) {
			c++;
			System.out.print(c +" ");	
			if(c==10) break;//while을 벗어나라
		
		}//while
		//while에 break가 걸려있지 않으면 무한loop가 돈다.
	
		
	}

}
