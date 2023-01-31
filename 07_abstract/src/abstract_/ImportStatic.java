package abstract_;

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.Math.*;//파일 내 모든 것. wild card. 패키지명은 와일드 설정 불가
import static java.lang.System.out;
import static java.lang.String.format;

public class ImportStatic {

	public static void main(String[] args) {
		out.println("난수 = " + Math.random());
		out.println("난수 = " + random());//위 import때문에 Math생략이 가능해짐.
		out.println("제곱 = " + Math.pow(3, 4));
		out.println("제곱 = " + pow(3, 4));
		out.println("소수 이하 2째 자리 = "+format("%.2f",43.45567));
		
	}

}
