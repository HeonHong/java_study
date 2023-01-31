package collection;

import java.util.Iterator;
import java.util.Vector;



public class VetorMain {//자바만 사용할 때 많이 사용하고, 웹이랑 사용할 때는, ArrayList 스프링은 Map사용.

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size());//0. 들어간 데이터의 개수
		System.out.println("벡터 용량 = " + v.capacity());//10. 기본으로 잡힌 용량. capacity는 다른 컬랙션들에는 없다.
		System.out.println();
		
		System.out.println("항목추가");
		for(int i=1;i<=10;i++) {
			v.add(i+"");
			System.out.println(v.get(i-1) + " ");//index는 0부터
		}//for
		
		System.out.println("벡터크기 = " + v.size());
		System.out.println("벡터용량 = " + v.capacity());
		System.out.println();
		
		
		System.out.println("항목 1개 추가");
		v.addElement(5+"");//중복허용
		System.out.println("벡터크기 = " + v.size());
		System.out.println("벡터용량 = " + v.capacity());
		System.out.println();
		
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");//왜 get인데 굳이 뒤에 ""를 붙여야 하나?
		}//for
		
		System.out.println("마지막 항목 삭제");
		//v.remove("5"); 앞에 있는 문장"5"가 삭제
		v.remove(10);
		
		Iterator it = v.iterator();//접근 제어자. 생성 시 메소드 이용
		while(it.hasNext()) {//hasNext() 항목이 있으면 true 없으면 false
			it.next();//위치에서 항목을 꺼내서 buffer(임시공간)에 저장하고 다음 위치로 이동. 
		}//while
	}

}
