package sungJuk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		int count =0;
		
		
		Iterator<SungJukDTO> it = list.iterator();
		//Iterator generic 안 걸 경우, it.next();칠 때 캐스팅 필요. 자식 = (자식)부모 캐스팅 필요함.
		while(it.hasNext()) {
			SungJukDTO sungJukDTO= it.next();
			if(sungJukDTO.getName().equals(name)) {
				it.remove();//it.remove()는 반드시 it.remove()가 반환하는 항목을 지운다.
				count++;
			}
		
		/*for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				i--;//>> 이렇게 해주면 두개의 동일한 이름이 붙어 있을 때 누락하지 않고 다 지운다.
				count++;
			}//if
		}//for
		
		if(count ==0) {
			System.out.println("삭제할 이름이 없습니다.");
		}else {
			System.out.println("모든 데이터를 삭제했습니다.");
		}
		*/

	}
//list에서 데이터를 하나 지우면 인덱스 번호가 재배정된다.

	}
}
	

/* 이름은 중복이 되어있다 -> 똑같은 이름이 2개 이상이라면 다 지우기
 *  삭제할 이름을 입력: 홍길동
 *  삭제할 이름이 없습니다.
 *  
 *  또는
 *  
 *  삭제할 이름을 입력 : 홍길동
 *  모든 데이터 삭제했습니다.
 *  */