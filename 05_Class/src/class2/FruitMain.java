/*
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자(품명, 1월, 2월, 3월) >> 데이터 직접 입력. 스캐너x
calcTot()
display()
output() - static


클래스 : FruitMain


[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
        xxx   xxx   xxx            output()로 처리
*/

package class2;

import java.util.ArrayList;

public class FruitMain {
	private int jan, feb, mar, tot;
	String pum;
	private static int sumJan, sumFeb, sumMar;
	

	FruitMain(String pum,int jan, int feb, int mar ){
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		
	}
	
	void calcTot() {
		sumJan+=jan;
		sumFeb+=feb;
		sumMar+=mar;
		this.tot = jan + feb + mar;
	}
	
	void display() {
		System.out.println(pum + "\t" + jan +"\t" + feb + "\t" + mar + "\t" + tot);
		
	}
	
	static void output() {
		System.out.println("\t" +sumJan+ "\t" +sumFeb +"\t" +sumMar);
		
	}
	
	public static void main(String[] args) {
	

		
		FruitMain[] fruitMain  = {new FruitMain("사과", 100,80,75),
		           new FruitMain("포도", 30,25,10),
		           new FruitMain("딸기", 25,30,90)};
		
		
		
		System.out.println("pum\tJAN\tFEB\tMAR\tTOT");
		for(int i=0;i<fruitMain.length;i++) {
			fruitMain[i].calcTot();
			fruitMain[i].display();
		}
		output();
		
	}

}

/*
package class2;

public class FruitMain {
	private int jan, feb, mar, tot;
	private String pum;
	private static int sumJan, sumFeb, sumMar;
	
	FruitMain(){
		
	}
	
	FruitMain(String[] pum,int jan, int feb, int mar ){
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		
	}
	
	void calcTot() {
		sumJan+=jan;
		sumFeb+=feb;
		sumMar+=mar;
		this.tot = jan + feb + mar;
	}
	
	void display() {
		System.out.println(pum + "\t" + jan +"\t" + feb + "\t" + mar + "\t" + tot);
		
	}
	
	static void output() {
		System.out.println("\t" +sumJan+ "\t" +sumFeb +"\t" +sumMar);
		
	}
	
	public static void main(String[] args) {

		FruitMain[] fruitMain = new FruitMain[3];
		
		for(int i=0;i<fruitMain.length;i++) {
			fruitMain[i] = new FruitMain();
		}
		
		fruitMain[0] 
		
		FruitMain fruitMain1 = new FruitMain("사과", 100,80,75);
		fruitMain1.calcTot();
		FruitMain fruitMain2 = new FruitMain("포도", 30,25,10);
		fruitMain2.calcTot();
		FruitMain fruitMain3 = new FruitMain("딸기", 25,30,90);
		fruitMain3.calcTot();
		
		System.out.println("pum\tJAN\tFEB\tMAR\tTOT");
		fruitMain1.display();
		fruitMain2.display();
		fruitMain3.display();
		output();
		
	}

}
*/