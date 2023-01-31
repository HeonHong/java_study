package constructor;

public class Exam {
	private String name;
	private String dap;
	private char[] ox;//생성자에 작성 안할거면 여기서 new char[5]
	private int score;
	private final String JUNG="11111";
	
	public Exam(String a) {
		this.name = a;
		ox = new char[5]; //char[5] ox = new char[5];로 하면 지역변수로 된다. 조심!!!!
	}
	
	public void compare(String a) {
		for(int i=0;i<5;i++) {
			if(this.JUNG.charAt(i) == a.charAt(i))
				ox[i] = 'o';
			else ox[i] = 'x';
			
		this.dap = ox[0]+" "+ox[1] +" "+ox[2]+" "+ox[3]+" "+ox[4]; 	
		}
	}
	public String getName() {
		return name;
	}
	
	public String getOx() {
		return dap;
	}
	
	public int getScore() {
		for(int i=0;i<5;i++) {
			if(ox[i] == 'o')
				score+=20;
		}
		return score;
	}


	
	}
	

