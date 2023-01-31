package class_;

public class MemMain {

	public static void main(String[] args) {
		MemService memService = new MemService();
		//왜 Service에서 menu static처리하고나서 MemService.menu(); 이렇게 하지 말라고 하셨는지?
		//static은 메모리가 배분된 영역자체가 작다
		//클래스는 대문자, 클래스의 객체는 소문자
		memService.menu();

	}

}
