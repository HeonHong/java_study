package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//추상클래스라서 NumberFormat nf = new NumberFormat();
		// 3자리마다,찍고 소수 이하 3째자리까지
		NumberFormat nf = new DecimalFormat();//DecimalFormat은 자식클래스임.
		System.out.println(nf.format(123456789.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
	
	
		NumberFormat nf2 = new DecimalFormat("#,###.##원");//유효숫자만 찍어라
		System.out.println(nf2.format(123456789.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");//소수 둘째자리까지 무조건 찍어라
		System.out.println(nf3.format(123456789.456789));
		System.out.println(nf3.format(12345678));
		System.out.println(nf3.format(0));
		System.out.println();
		
		
		//자식말고 메소드 이용
		NumberFormat nf4 = NumberFormat.getInstance();
		//모든 클래스는 꼭 new로 생성해야하는 것이 아니다.
		//위와 같이 메소드를 이용해서 생성도 가능하다.
		nf4.setMaximumFractionDigits(2);//소수이하 기본 3째자리에서 2째자리로 변경.
		nf4.setMinimumFractionDigits(2);//0을 소수 이하 2째자리까지 강제로 출력.
		System.out.println(nf4.format(123456789.456789));
		System.out.println(nf4.format(12345678));
		System.out.println(nf4.format(0));
		System.out.println();

		NumberFormat nf5 = NumberFormat.getCurrencyInstance();// '₩'표시. 이건 국가에 맞게 알아서 표현
		//모든 클래스는 꼭 new로 생성해야하는 것이 아니다.
		//위와 같이 메소드를 이용해서 생성도 가능하다.
		nf5.setMaximumFractionDigits(2);//소수이하 기본 3째자리에서 2째자리로 변경.
		nf5.setMinimumFractionDigits(2);//0을 소수 이하 2째자리까지 강제로 출력.
		System.out.println(nf5.format(123456789.456789));
		System.out.println(nf5.format(12345678));
		System.out.println(nf5.format(0));
		System.out.println();
		
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.US);
		// '$'표시. 이건 국가에 맞게 알아서 표현
		//NumberFormat nf6 = NumberFormat.getInstance(Locale.US); 이거는 통화표시 안됨.
	
		nf5.setMaximumFractionDigits(2);//소수이하 기본 3째자리에서 2째자리로 변경.
		nf5.setMinimumFractionDigits(2);//0을 소수 이하 2째자리까지 강제로 출력.
		System.out.println(nf6.format(123456789.456789));
		System.out.println(nf6.format(12345678));
		System.out.println(nf6.format(0));
		System.out.println();

		
	
	
	}
	
	

}
