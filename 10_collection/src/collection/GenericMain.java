package collection;

class GenericTest<T>{
	private T t;
	
	public void setA(T t){
		this.t = t;
	}
	
	public T getA(){
		return t;
	}
}
//==============================================================================
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		//위의 T형으로 설정을 해놓음으로서 객체를 생성할 때 형태를 지정할 수 있다.
		aa.setA("홍길동");
		System.out.println("이름 = "+ aa.getA());
		
		GenericTest<Integer> bb= new GenericTest<Integer>();
		bb.setA(25);
		System.out.println("나이 = " + bb.getA());
	}

}
