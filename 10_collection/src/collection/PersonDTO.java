package collection;

public class PersonDTO implements Comparable<PersonDTO> {
	private String name;
	private int age;
	
	public PersonDTO() {
	
	}//에러 방지용
	
	public PersonDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 = " + name + "\t나이" + age;
	}

	@Override
	public int compareTo(PersonDTO p) {//sort랑 엮여있는 것이다.
		if(this.age < p.age) return -1;
		else if(this.age > p.age) return 1;
		else return 0;
	}
	
	
}
