package nested;

public class AbstractMain  {

	
	public static void main(String[] args) {		
		
		AbstractTest at = new AbstractTest() {//new 다음에 {}가 있기 때문에 클래스이다. 익명 inner class
			@Override
			public void setName(String name) {
				this.name = name;
			}
		};//1회성으로 오버라이드. 이렇게 안해놓으면 프로그램 종료될 때까지 계속 메모리에 존재하게 된다. 
		//extends를 안해도 된다. 임시 방편이다.
		
		InterA ia = new InterA() {//원래 인터페이스는 new가 안된다. 여기서 new는 익명class{} (흑기사)를 new한 것이다.
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {
		//추상메소드가 없기 때문에 원하는 메소드를 골라서 Override.
		//편한 거 가져다 쓴다.
		};
		
		
	}
}
