package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException{
		Date date = new Date();
		System.out.println("오늘날짜 : " + date);
		
		SimpleDateFormat sdf= new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		
		//내 생일- 1991 07 15
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910716103515");//String >> Date변환
		
		
		
		System.out.println("내 생일 : " +birth);
		System.out.println("내 생일 : " +sdf.format(birth));
			
		//기준이 시스템의 날짜, 시간
		//Calendar cal = new Calendar(); Calendar가 추상이라 생성 불가. error
		Calendar cal = new GregorianCalendar();//Sub Class이용하여 생성
		Calendar cal1 = Calendar.getInstance();//메소드를 이용하여 생성
		//기준을 캐나다
		Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
				
		int year = cal.get(1);
		int year1 = cal.get(Calendar.YEAR);
		//int year2 = cal.get(YEAR);YEAR가 상수에 STATIC이라 TODAY클래스에서 먼저찾는다. Calendar.을 붙여줘야함. 
		int month = cal.get(Calendar.MONTH)+1;
		//1월이 0부터 시작
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);//일요일-1, 월-2, 화-3
		String dayOfWeek=null;
		switch(week) {
			case 1 : dayOfWeek="일"; break;
			case 2 : dayOfWeek="월"; break;
			case 3 : dayOfWeek="화"; break;
			case 4 : dayOfWeek="수"; break;
			case 5 : dayOfWeek="목"; break;
			case 6 : dayOfWeek="일"; break;
			case 7 : dayOfWeek="일"; break;
		}
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
				
		
		System.out.println(year + "년" + month+"월" + day+"일" + dayOfWeek+ "요일"
				+hour + ":" + minute + ":" + second);
		
	}

}
