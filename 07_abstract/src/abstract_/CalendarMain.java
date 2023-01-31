/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10   

일   월   화   수   목   금   토
      1   2   3   4   5
6   7   8   9   10   11   12
13   14   15   16   17   18   19
20   21   22   23   24   25   26
27   28   29   30   31
 */

package abstract_;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarMain {
	protected int year;
	protected int month;
	protected int day = 1;
	Scanner scan = new Scanner(System.in);
	Calendar cal = new GregorianCalendar();
	
	protected CalendarMain(){
		System.out.print("연 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
	}
	
	protected void calc() {
		
		cal.set(year, month-1, day);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}
	
	protected void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for(int i=1;i<cal.get(Calendar.DAY_OF_WEEK);i++) {
			System.out.print("\t");
		}
		
		for(int i=1;i<=days;i++) {
			System.out.print(i+"\t");
			if((cal.get(Calendar.DAY_OF_WEEK)+i-1)%7==0)
				System.out.println();
		}
	}
	

	public static void main(String[] args) {
		CalendarMain calendarMain = new CalendarMain();
		calendarMain.calc();
		calendarMain.display();

	}

}
