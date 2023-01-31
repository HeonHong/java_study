package class_;

//1인분
public class MemDTO {
	private String name;
	private int age;
	private String phone;
	private String address;
	//setter,생성자/getter가 필요
	
	public MemDTO(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
/*
@Override
public String toString() {
	
	return name+" "+age +" "+phone +" " + address ;
}
*///이렇게 하면 그냥 memDTO로 프린트해도 주소가 아니라 이 값들이 나간다.
}


