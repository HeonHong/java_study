package abstract_;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain2 {
	private int year, month, week, lastDay;
	
	public CalendarMain2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("연 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
	}
	
	public void calc() {
		//Calendar cal = new Calendar(); 추상이라서 불가. 메소드 or 자식 클래스 이용
		Calendar cal = Calendar.getInstance();//클래스 생성 - 시스템의 설정을 그대로 가져온다.
		
		//시스템시간을 원하는 날짜로 변경
		cal.set(Calendar.YEAR, year);//년도 변경
		cal.set(Calendar.MONTH, month-1);//월 변경. 1월 0, 2월 1, ......
		cal.set(Calendar.DAY_OF_MONTH, 1);//일 변경 일요일 1, 월요일 2, ......
		
		week = cal.get(Calendar.DAY_OF_WEEK);//매달 1일의 요일
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//28, 29, 30, 31??

	}
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
			
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if(week%7 == 0) System.out.println();// 요일의 번호니까!!
			week++;
		}
	}
	
	public static void main(String[] args) {
		CalendarMain2 calendarMain = new CalendarMain2();
		calendarMain.calc();
		calendarMain.display();
		
	}
}
