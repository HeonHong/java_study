package inheritance;

import java.util.Scanner;

class ShapeTest{
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");
	}
	
	public void calcArea() {
		System.out.println("도형을 계산합니다.");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다.");
	}
}
//=========================================================
class SamTest extends ShapeTest{
	protected int base, height;
	
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area= base*height/2.0;
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 = "+area);
	}
	
}
//=========================================================
class SaTest extends ShapeTest{
	protected int width, height;
	
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로 : ");
		width = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area= width*height;
	}
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = "+area);
	}
	
}
//=========================================================
class SadariTest extends ShapeTest{
	protected int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		bottom = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	
	@Override
	public void calcArea() {
		area= (top+bottom)*height/2.0;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = "+area);
	}
	
}
//=========================================================
public class ShapeMain {

	public static void main(String[] args) {
		//결합도 낮추기
		//ShapeTest sha = new ShapeTest(); 이거 하지 말것
		
		
		ShapeTest shape =null;
		shape = new SamTest();//부모==자식, 다형성
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
		shape = new SaTest();
		
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
		
		
		/*
		SamTest samTest = new SamTest();//1:1관계 > 결합도 낮추는 게 좋음
		
		samTest.calcArea();
		samTest.dispArea();
		System.out.println();
		
		
		SaTest saTest = new SaTest();
		
		saTest.calcArea();
		saTest.dispArea();
		System.out.println();
		
		SadariTest sadariTest = new SadariTest();
		
		sadariTest.calcArea();
		sadariTest.dispArea();
		System.out.println();
		*/
		
		
		
	}

}
