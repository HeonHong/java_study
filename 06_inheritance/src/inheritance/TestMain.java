package inheritance;

class AA{
	public int a = 3;
	public void disp() {
		a+=5;
		System.out.print("AA : " + a + " ");
	}
}
//=================================================
class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.print("BB : " + a + " ");
	}
}
//======================================
public class TestMain {

	
	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp();
		
		System.out.println("aa : " + aa.a);
		System.out.println();
		
		AA bb = new BB();//부모 클래스가 자식 클래스를 참조. 부모 = 자식
		bb.disp();// 원래는 AA를 가야하지만 오버라이드이기때문에 13이된다.
		System.out.println("bb : " + bb.a);//이건 오버라이드 개념이 없기때문에 그냥 3.
		System.out.println();
		
		BB dd = (BB)bb;//자식 = (자식)부모. 부모가 자식을 참조하는 꼴이다.
		dd.disp();//18
		System.out.println("dd : " + dd.a);//18
		System.out.println();
		
		AA cc = new AA();
		cc.disp();//8
		System.out.println("cc : " + cc.a);//8
		System.out.println();
		
		
	}

}
