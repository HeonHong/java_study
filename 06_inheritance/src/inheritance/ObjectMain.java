package inheritance;


class Test /*extends Object가 생략됨*/{//자바의 모든 클래스는 Object로부터 상속받는다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass() + "개바부";// string의 리턴값을 바꿔줘서 이렇게 주소값이 나간다.
	}
}


//============================================================
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString());//toString()은 object의 메소드로 클래스의 주소를 생성해주는 메소드이나 생략 가능하다.
		System.out.println("객체 t = " + t.hashCode());//주소를 10진수로 변경
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str);//apple이 나오는 이유는 overriding 되었기 때문이다.
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode());
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb));//주소 - false
		System.out.println("aa.equals(bb) : " + aa.equals(bb));//문자열 - true. 원래는 주소값 비교지만 override된거임.
		
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc==dd));//주소 - false
		System.out.println("cc.equals(dd) : " + cc.equals(dd) );//주소 - false
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff));//주소 - false
		System.out.println("ee.equals(ff) : " + ee.equals(ff) );//문자열 - true 이건 override 됨.
		
		//Object ee > object를 가르켜라
		
	}
}

/*
class Object{
	public boolean equals(Object); 참조값 비교!!!!! 문자열 아님
	public String toString(); 클@16진수
	public int hashCode(); 10진수
}

class Test extends Object{
	public String toString() 개바부
}

class String extends Object{
	public String toString(); 문자열
	pulic int hashCod(); 문자열을 10진수 변환.
						int는 유한하지만 문자열은 무한대라 마냥 믿을 수는 없다.
	public boolean equals(Object) 문자열 비교!!!!!! 중요함
}

}
*/