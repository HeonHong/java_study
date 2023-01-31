package collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//<String>이걸 generic이라고 하고 꼭 있지는 아니어도 된다.
		list.add("호랑이");//0
		list.add("사자");
		list.add("호랑이");//중복허용. 순서를 주면서 들어간다.
		//list.add("25");
		//list.add("43.8");
		list.add("기린");
		list.add("코끼리");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));  
		}
		
		for(String str : list) {//list.size()하지 않아도 된다.
			System.out.println(str);
		}
		
		

	}

}
