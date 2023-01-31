package class_;

class This{
	
	private int a;
	
	public void setA(int a){
		//a=a; 여기서 이렇게 치면 이름이 동일해서 왼쪽a가 인수로 작동한다. 그래서 이 값은 int a로써 인식된다.	
		System.out.println("this = " + this);
		this.a = a;
	}
	public int getA() {
		return a;//this 생략
	}
}

//==============================================
public class ThisMain {
	public static void main(String[] args) {
		This t = new This();
		System.out.println("객체  = t" + t);
		t.setA(10);
		System.out.println(t.getA());
		System.out.println();
		
		This t1 = new This();
		System.out.println("객체  = t1" + t1);
		t1.setA(10);
		System.out.println(t1.getA());
		
		
	}
}
