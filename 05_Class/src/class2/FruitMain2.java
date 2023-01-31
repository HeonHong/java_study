package class2;
class Fruit{
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb,sumMar;
	

	public Fruit(String pum, int jan, int feb, int mar) {//argument,parameter 거의 비슷한 얘기임.
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		
	}
	
	public void calcTot() {
			tot = jan + feb + mar;
			sumJan+=jan;
			sumFeb+=feb;
			sumMar+=mar;
	}
	
	public void display() {
		System.out.println(pum + "\t" + jan +"\t" + feb + "\t" + mar + "\t" + tot);
		
	}
	
	static void output() {
		System.out.println("\t" +sumJan+ "\t" +sumFeb +"\t" +sumMar);
		
	}
	
}
public class FruitMain2 {

	public static void main(String[] args) {
		Fruit[] ar = {new Fruit("사과", 100, 80,75),
					new Fruit("포도", 30, 25,10), 
					new Fruit("딸기",25,30,90)};
		
		
		System.out.println("pum\tJAN\tFEB\tMAR\tTOT");
		for(int i=0;i<ar.length;i++) {
			ar[i].calcTot();
			ar[i].display();
		}
		
		/*
		Fruit apple = new Fruit("사과", 100, 80,75);
		Fruit grape = new Fruit("포도", 30, 25,10);
		Fruit straw = new Fruit("딸기",25,30,90);
		
		apple.calcTot();
		grape.calcTot();
		straw.calcTot();
		System.out.println("pum\tJAN\tFEB\tMAR\tTOT");
		apple.display();
		grape.display();
		straw.display();
		Fruit.output();
		*/

	}

}
