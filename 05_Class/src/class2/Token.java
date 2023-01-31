package class2;

import java.util.StringTokenizer;

public class Token {
	
	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		//빈 공간은 무시
		System.out.println("토큰 개수 = " + st.countTokens());
		
		
		while(st.hasMoreTokens()) {//토큰이 있으면 true, 없으면 false. 
			System.out.println(st.nextToken());//next로 기존에 있던 토큰을 꺼내주고 다음 토큰으로 이동
			//next를 통해 토큰 개수만큼 while문이 돈다.
		}

		System.out.println("============================");
		String[] ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}
	}
}
