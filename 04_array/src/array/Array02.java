package array;

public class Array02 {

	public static void main(String[] args) {
		String[] ar = {"사자", "코끼리", "호랑이", "카멜레온", "오리너구리", "기린", "원숭이"};
		for(int i=0; i<ar.length;i++) {
			System.out.println("ar[" + i + "] = " + ar[i] );
			System.out.println("문자열의 크기 = " + ar[i].length());
			//.length는 배열의 크기이고 .length()는 문자열의 크기이다
			System.out.println("첫번째 문자 = " + ar[i].charAt(0));
			//문자열은 배열번호 뿐만 아니라 문자열 자체의 글씨번호도 지정되어 있다.
			System.out.println("마지막 문자 = " + ar[i].charAt(ar[i].length()-1));
		}//for문
		System.out.println();
		
		System.out.println("확장 for문");
		for(String aa : ar) {
			System.out.println(aa);
		}
		

	}
}
