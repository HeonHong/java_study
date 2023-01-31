package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();//이건 객체값으로 잡는다. int X/ Integer로!
			//키값		value값
	
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");//Value 중복허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");//Key값 중복허용. value값 변경됨
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book102"));
		System.out.println(map.get("book501"));//null값
	}

}
