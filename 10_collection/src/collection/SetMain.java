package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//순서가 없다
		set.add("호랑이");//0
		set.add("사자");
		set.add(new String("호랑이"));//중복허용x/주소값이 아니라 문자열 기준으로 비교
		//list.add("25");
		//list.add("43.8");
		set.add("기린");
		set.add("코끼리");

		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
