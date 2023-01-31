package class_;

public class Compute {
	
	private int x,y,sum,sub,mul;
	private double div;
	
	public void calc() {
		this.sum = this.x + this.y;//sum = x+y가능
		this.sub = this.x - this.y;
		this.mul = this.x * this.y;
		this.div = (double)(this.x) / y;
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getSum() {
		return sum;
	}
	
	public int getSub() {
		return sub;
	}
	
	public int getMul() {
		return mul;
	}
	
	public double getDiv() {
		return div;
	//자릿수 지정해줄 거면 꼭 String으로 설정해줘야한다.
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	

	
}
