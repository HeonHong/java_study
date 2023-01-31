package class_;

import java.util.Scanner;

public class MemService {
	
	private MemDTO[] ar = new MemDTO[5];//배열 생성. 초기값 null
	
	public void menu(){//static이 있으면 MemService를 호출할 필요 없지만 그게 아니라면 필요.
		Scanner scan = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("*************");
			System.out.println("****1.가입****");
			System.out.println("****2.출력****");
			System.out.println("****3.수정****");
			System.out.println("****4.탈퇴****");
			System.out.println("****5.끝내기***");
			System.out.println("*************");
			System.out.print("번호 : ");
			num = scan.nextInt();
			System.out.println();
			
			if(num==5) break;//while을 벗어나라
			if(num==1) insert();
			else if(num==2) list();
			else if(num==3) update();
			else if(num==4) delete();
			else System.out.println("1~5사이의 숫자만 입력해주세요.");
			
			
			
		}//while
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}//menu
	
	

	public void insert() {
		Scanner scan = new Scanner(System.in);
		int i;
		for(i=0;i<ar.length;i++) {
			if(ar[i]==null)	break;	
		}//for i
		if(i==ar.length) {
			System.out.println("5명 정원이 꽉 찼습니다.");//여기는 지금 i가 5이다. 어차피 length도 5고 i도 5니까 ㄱㅊ
			return;//중요!!!!!!여기서 return이면 메소드를 벗어나라는 의미이다.
		}else {/*for(i=0;i<ar.length;i++) { 중요!!! 위에서 어차피 돌았으니까 굳이 여기서 for문 돌릴 필요 없어진다.*/
			/*if(ar[i]==null) { 여기도 위와 같은 이유로 필요 없어진다*/
				//데이터 입력
				System.out.print("이름 입력 : ");
				String name = scan.next();
				System.out.print("나이 입력 : ");
				int age = scan.nextInt();
				System.out.print("번호 입력 : ");
				String phone=scan.next();
				System.out.print("주소 입력 : ");
				String address = scan.next();
				ar[i] = new MemDTO(name, age, phone, address);
				System.out.println("1 row created");
				//break;//빈 공간을 찾았으면 빈공간이 뒤에 더 있는지 확인할 필요는 없으니까 나간다. 근데 for문 없어도 되니까 필요 없다.		
		}//if
		
		int count=0;
		for(i=0;i<ar.length;i++) {
			if(ar[i]==null) {
				count++;
			}//if
		}//for i
		System.out.println(count + "자리가 남았습니다.");
	}//insert()
	
	public void list() {
		System.out.println("이릅\t나이\t핸드폰\t\t주소");
		for(MemDTO memDTO:ar) {
			if(memDTO !=null) {
				//System.out.println(memberDTO);이렇게 찍으면 주소값이다?!
				System.out.println(memDTO.getName()+"\t"
								+memDTO.getAge()+"\t"
								+memDTO.getPhone()+"\t\t"
								+memDTO.getAddress());
				

			}
			
		}//for
		System.out.println();
	}//list()
	
	public void update() {//여기서 중요한 포인트는 배열이 null값인지 아닌지 확인해야한다.그렇지 않고 바로 비교하면 NPE나온다. 
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("핸드폰 번호를 입력하세요");
		String phone = scan.next();
		int i;
		System.out.println("이릅\t나이\t핸드폰\t\t주소");
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				if(ar[i].equals(phone)) {
					System.out.println(ar[i].getName()+"\t"
							+ar[i].getAge()+"\t"
							+ar[i].getPhone()+"\t\t"
							+ar[i].getAddress());
					
					System.out.print("수정할 이름 입력 : ");
					ar[i].setName(scan.next());
					System.out.print("나이 입력 : ");
					ar[i].setAge(scan.nextInt());
					System.out.print("번호 입력 : ");
					ar[i].setPhone(scan.next());
					System.out.print("주소 입력 : ");
					ar[i].setAddress(scan.next());
					System.out.println("1row(s) updated");
					break;
				}//안쪽 if
			}//바깥쪽 if
		}//
		if(i== ar.length) System.out.println("찾는 회원이 없습니다.");
	
	}//update()
	
	
	
	public void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("핸드폰 번호를 입력하세요");
		String phone = scan.next();
		int i;
		System.out.println("이릅\t나이\t핸드폰\t\t주소");
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				if(ar[i].equals(phone)) {
					ar[i] = null;//안에 있는 내용을 지울 방법은 없고 주소를 없애면 나머지 내용은 JVM이 알아서 삭제해준다.
					System.out.println("1row(s) deleted");
					break;
				}//if
	}//for}
		

		}

	}
}

	