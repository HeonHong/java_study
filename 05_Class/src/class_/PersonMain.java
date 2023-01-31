package class_;


class Person {//메뉴 중 한 개
	//private String name; 이렇게 하면 데이터를 가려서 다른 클래스에서 볼 수가 없다.
	//private int age; 자기 자신 안에서만 접근이 가능해진다. 그래서 클래스에서 접근할 수 있게 메소드를 만들어 준다.
	//private을 다는 거는 안에 있는 커피, 프림, 설탕은 보이지 않게하는 거다.
	//메소드는 밀크커피, 설탕커피 각각 버튼을 만들어주는 셈이다.
	private String name;//필드, 초기화, null
	private int age;//필드, 초기화, 0
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int a) {//구현
		age = a;
	}
	
	public void setData(String n, int a) {//구현
		name = n;
		age = a;
	}
	
	public void setData() {//구현
		
	}
	
	public void setName(String n) {//구현
		name = n;
	}
	

}
//----------------------------------------------------------------
public class PersonMain {
	
	public static void main(String[] args) {
		//int aa;		//정수형 변수
		//double aa;	//실수형 변수
		Person aa;		//객체형 변수. (클래스형 변수x)
		aa = new Person();//메모리 생성
		
		System.out.println("객체 aa= " + aa);
		//aa.name = "홍길동";
		//aa.age =25;
		//System.out.println("이름 = " + aa.name + "\t 나이 = " + aa.age);

		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("이름 = " + aa.getName() + "\t 나이 = " + aa.getAge());
		System.out.println();
	
		Person bb;
		bb = new Person();
		System.out.println("객체 bb= " + bb);
		bb.setName("코난");
		bb.setAge(13);
		System.out.println("이름 = " + bb.getName() + "\t 나이 = " + bb.getAge());
		System.out.println();
		
		Person cc;
		cc = new Person();
		System.out.println("객체 cc= " + cc);
		cc.setData("둘리", 100);
		System.out.println("이름 = " + cc.getName() + "\t 나이 = " + cc.getAge());
		System.out.println();
		
		Person dd;
		dd = new Person();
		System.out.println("객체 dd= " + cc);
		//dd.setData();public void setData(String n, int a) 이것만 있을 때 이렇게 쓰면 메소드 사용 불가해서 저 메소드를 만들어 줘야한다.
		System.out.println("이름 = " + dd.getName() + "\t 나이 = " + dd.getAge());
		System.out.println();
		
	}

}
