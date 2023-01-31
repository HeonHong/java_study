package abstract_;

public class AbstractMain extends AbstractTest {

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		//AbstractTest at = new AbtractTest(); Abstract은 new로 객체 선언 불가.
		//자식클래스를 생성해서 선언한다.

		AbstractTest at = new AbstractMain();//자식클래스로 객체 선언
	}

}
