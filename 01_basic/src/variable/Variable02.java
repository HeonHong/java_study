package variable;

public class Variable02 {
	static int b;//메모리에 초기값이 잡혀서 들어온다. ?? 질문
	int a; //전역 변수 > 필드/heap 영억
	
	public static void main(String[] args) {

		int a = 5 ; //local variable 지역변수. 일정 구역에 있어서 끝나면 없어진다. 쓰레기값. 반드시 초기화 필요
		//int a; 지역내 동일명 변수 불가. 필드는 다른 메모리 구역에 있어서 동일해도 stack영역
		
		System.out.println("지역변수 a = " + a);
		System.out.println("필드 b = " + Variable02.b);
		//System.out.println("필드 b = " + Variable02.a);는 불가.why? static이 아니라서		
		System.out.println("필드 b = " + new Variable02().a);
		
	}

}
