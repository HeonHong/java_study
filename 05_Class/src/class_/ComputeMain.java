/*
객체배열을 이용하여 작성하시오
데이터는 키보드로부터 입력 받으세요

클래스명 : Compute
필드 : int x,y,sum,sub,mul
       double div
메소드 : setX(~)
       setY(~)
       calc() - 합차곱몫을 계산
       getX()
       getY()
       getSum()
       getSub()
       getMul()
       getDiv()

클래스명 : ComputeMain

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X      Y      SUM      SUB      MUL      DIV
320      258
256      125
452      365
*/

package class_;
import java.util.Scanner;
public class ComputeMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Compute[] c = new Compute[3];//배열의 방을 생성해준 것. 객체 배열 생성, 결합도 1:1 관계
		//Object[]c 를 사용하면 결합도가 낮아진다.
		
		
		//Object[] ar = new Object[3]; 어떤 클래스 값이건 들어올 수는 있지만
		//하지만 어떤 값이 들어갔는지는 알 수 없다.
		
		//ar[0] = new SungJuk(); 이거 불가. why?이미 compute로 만든 거니까.
		//ar[0] = new Compute(); 이건 가능.
		
		int x, y;
		
		for(int i=0;i<c.length;i++) {
			c[i] = new Compute();//방에 클래스 주소를 갖고 있지 않으니까 클래스를 생성해주는 것.
			System.out.print("x입력 : ");
			x = scan.nextInt();
			c[i].setX(x);
			//c[i].setX(scan.nextInt());
			
			System.out.print("y입력 : ");
			y = scan.nextInt();
			c[i].setY(y);
			c[i].calc();
			//c[i].setY(scan.nextInt());
			System.out.println();
		}//fori
		
		
		/*
		 for(Compute data : c) {
			System.out.println(data.getX() +"\t"
					+ data.getY() +"\t" 
					+ data.getSum() +"\t" 
					+ data.getSub() +"\t"
					+ data.getMul()+"\t"
					+ data.getDiv());
		}
		*/
		
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].getX() +"\t"
							+ c[i].getY() +"\t" 
							+ c[i].getSum() +"\t" 
							+ c[i].getSub() +"\t"
							+ c[i].getMul()+"\t"
							+ c[i].getDiv());
		}//fori
		
	}

}
