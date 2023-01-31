package variable;

public class Variable05 {

	public static void main(String[] args) {

		int a = 10;//정수형 변수
		String b = "호랑이";//포인터 변수. 객체
		
		int[] ar = new int[5];
		//정수형 배열. new를 사용했으니까 이건 주소값이다. 방번호는 0부터 4까지이다.
		String[] ar2 = new String[3];//객체 배열
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		//ar[5] = 60; 실행시 에러나온다. Unresolved compilation problems
		
		ar2[0] = "사자";
		ar2[1] = "기린";
		ar2[2] = "코끼리";

	}

}
