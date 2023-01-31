package abstract_;

public abstract class AbstractTest {//POJO형식(Plain Old Java Object). 상속 없이 그냥 오리지널 클래스라는 의미
	protected String name;

	public String getName() {//구현부
		return name;
	}

	public abstract void setName(String name);//추상메소드 - 아직 만들어지지 않은 메소드를 의미한다.
	//추상 메소드이려면 추상 클래스여야한다. 반대의 경우 추상 클래스일 수는 있지만 메소드들이 추상 메소드일 필요는 없다. 없을 수도 있다.
	
	
}
