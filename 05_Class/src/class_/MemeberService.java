package class_;

import java.util.Scanner;

public class MemeberService {
	public MemberDTO[] ar = new MemberDTO[5];
	Scanner scan = new Scanner(System.in);
	
	int input;
	String compare;
	
	public void menu(){
		for(int i=0;i<ar.length;i++) {
			ar[i] = new MemberDTO();
			ar[i].setName("");
			ar[i].setAge("");
			ar[i].setCell("");
			ar[i].setAddress("");
		}
		while(true) {
			System.out.println("*************");
			System.out.println("****1.가입****");
			System.out.println("****2.출력****");
			System.out.println("****3.수정****");
			System.out.println("****4.탈퇴****");
			System.out.println("****5.끝내기***");
			System.out.println("*************");
			System.out.print("번호 : ");
			input = scan.nextInt();
			if(input == 1) insert();
			else if(input==2) list();
			else if(input==3) update();
			else if(input==4) delete();
			else break;
		}//while
	}
	
	public void insert() {
		for(int i=0;i<ar.length;i++) {
			if(ar[i].getName()!="") {continue;
			}else{
			System.out.print("이름 입력 : ");
			ar[i].setName(scan.next());
			System.out.print("나이 입력 : ");
			ar[i].setAge(scan.next());
			System.out.print("핸드폰 입력 : ");
			ar[i].setCell(scan.next());
			System.out.print("주소 입력 : ");
			ar[i].setAddress(scan.next());
			break;
			//여기서 ar[i]는 주소를 갖는 건가? 아니면 특정 값을 갖는 건가?
			}//if
	
		}//for
		
		//System.out.println("5명의 정원이 꽉 찼습니다.");	
		
	}
	
	public void list() {
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i].getName()+"\t"+ar[i].getAge()+"\t"+ar[i].getCell()+"\t"+ar[i].getAddress());
		}//for
	}
	
	public void update() {
		System.out.print("핸드폰 번호 입력 : ");
		this.compare=scan.next();
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i].getCell().equals(compare)) {
				System.out.println(ar[i].getName()+" "+ar[i].getAge()+" "+ar[i].getCell()+" "+ar[i].getAddress());
				System.out.println();
				System.out.print("수정할 이름 입력 : ");
				ar[i].setName(scan.next());
				System.out.print("수정할 나이 입력 : ");
				ar[i].setAge(scan.next());
				System.out.print("수정할 핸드폰 입력 : ");
				ar[i].setCell(scan.next());
				System.out.print("수정할 주소 입력 : ");
				ar[i].setAddress(scan.next());
				break;
				
			}//if
			
			if(i==4) System.out.println("일치하는 번호 없음");
		}//for i
		
		
		
	}//update
	
	
	public void delete() {
		System.out.print("핸드폰번호 입력 : ");
		this.compare=scan.next();
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i].getCell().equals(this.compare)) {
				ar[i].setName("");
				ar[i].setAge("");
				ar[i].setCell("");
				ar[i].setAddress("");
				System.out.println("1 row deleted");
				break;
			}//if
			if(i==4) System.out.println("일치하는 번호 없음");
		}//for
		
	
	}
	
	
	
	
	
}//클래스



/*
private MemberDTO[] ar = new MemberDTO[5]; 
//필드는 이거만 있고 나머지는 다 메소드 설정

MemberService의 menu()호출;
System.out.println("프로그램을 종료합니다.");
*/