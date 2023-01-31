package while_;

public class DoWhile {

	public static void main(String[] args) {
		//A B C D E F ~~ X Y Z
		//내 답
		char ch = 'A';
		do {
			System.out.print(ch + " ");
			ch++;
			if((ch-'A')%7==0) System.out.println();
		}while(ch <= 'Z');//while
		
		
		//선생님 답
		ch ='A';
		int count = 0;
		while (ch <='Z') {
			System.out.print(ch + " ");
			ch++;
			count++;
			if(count%7==0) System.out.println();
		}
	}

}
