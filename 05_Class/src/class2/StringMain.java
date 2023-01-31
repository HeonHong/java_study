package class2;

public class StringMain {

	public static void main(String[] args) {

		String a = "apple";//literal 생성
		String b = "apple";
		if(a==b) System.out.println("a와b의 참조값은 같다.");
		else System.out.println("a와b의 참조값은 다르다.");
		if(a.equals(b)) System.out.println("a와b의 문자열은 같다.");
		else System.out.println("a와b의 문자열은 다르다.");
		System.out.println();
		
		String c = new String("apple");//이렇게 하면 메모리를 새로 잡는다.
		String d = new String("apple");
		if(c==d) System.out.println("c와d의 참조값은 같다.");
		else System.out.println("c와d의 참조값은 다르다.");
		if(c.equals(d)) System.out.println("c와d의 문자열은 같다.");
		else System.out.println("a와b의 문자열은 다르다.");
		System.out.println();
		
		String e = new String("apple");
		String f=e;// 이렇게 되면 a랑b 같이 힙영역에서 동일한 주소값을 갖게 된다. 문자열을 넘겨주는 것이 아니다.
	
		String g = "오늘 날짜는 " + 2022 + 9 + 27;
		System.out.println("문자열 크기 = " + g.length());
		for(int i=0;i<g.length();i++) {
			System.out.println(i + " : " + g.charAt(i));
		}//length는 배열의 크기이고 length()는 문자열의 크기이다
	
		System.out.println("부분 문자열 추출=" + g.substring(7));
		System.out.println("부분 문자열 추출=" + g.substring(7,11));//7부터 11전까지(7~10)
		
		System.out.println("대문자 변경=" + "Hello".toUpperCase());
		System.out.println("소문자 변경=" + "Hello".toLowerCase());
		
		System.out.println("문자열 검색=" + g.indexOf("짜"));//위치 출력 메소드
		System.out.println("문자열 검색=" + g.indexOf("날짜"));
		System.out.println("문자열 검색=" + g.indexOf("개바부"));//-1. 이 메소드는 없으면 '-1'이 출력된다.
		
		System.out.println("문자열 치환=" + g.replace("날짜" , "일자"));
	}
	
}

/*
문자열은 편집이 안되므로 메모리 4번 생성된다.
JVM에 의해서 삭제 시 Garbage Collector로 보낸다.
Garbage Collector가 실행되면 컴퓨터느 멈춘다.
  
"오늘 날짜는 " > 이걸 보관하는 주소의 값이 없기때문에 1회성으로 생성되고 지워진다.
"오늘 날짜는 2022"
"오늘 날짜는 20229"
"오늘날짜는 2022927"
	인덱스 0 1 2 3 4
e -----> "오늘날짜는 2022927"
*/