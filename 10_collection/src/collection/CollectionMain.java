package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {

	Collection<String> coll = new ArrayList<String>();//부모 = 자식
	coll.add("호랑이");//0
	coll.add("사자");
	coll.add("호랑이");//중복허용. 순서를 주면서 들어간다.
	coll.add("25");
	coll.add("43.8");
	coll.add("기린");
	coll.add("코끼리");
	
	
	Iterator<String> it = coll.iterator();
	it.next();
	System.out.println(it.next());
	System.out.println();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
		
//	//coll.get(0); Collection 타입에는 get메소드가 존재하지 않아 override 되지 않음.
//	Iterator<String> it = coll.iterator();
//	1. it.hasNext() -현재 위치에 항목이 있으면 참/없으면 거짓
//	2. it.next()	-현재 위치에 항목을 꺼내서 저장하고 다음 위치로 이동.
//	*while문 사용이 용이
//	}


