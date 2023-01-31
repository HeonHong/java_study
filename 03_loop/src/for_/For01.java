package for_;

public class For01 {

	public static void main(String[] args) {
		int i = 1;
		
		for(i=1; i<=10 ; i++) {
		System.out.println("Hello Java : " + i);
		}

		System.out.println("탈출 i = "  + i);
		System.out.println();

		//10 9 8 7 6 5 4 3 2 1
		
		for(i = 10; i>=1;i-- ) {//for(i; i>=1;i-- ) 
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		for(i = 'A'; i<='Z'; i++) {//사람들이 알아볼 수 있게 A~Z를 표시해줘야한다.
			System.out.print((char)i + " ");
		}
	
	
	}
	
	
	//질문. 두번째 for문에서 왜 무조건 i = 10으로 정의를 해줘야하는지. i만 작성해서 위의 값을 이용하면 안되나?
	//>> i만 쓰면 안된다. 변수만 쓰레기값으로 주는 것이라서. 이렇게 쓰고 싶으면 비워둘 것
}
