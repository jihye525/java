package api.lang;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//날짜시간에 관련된 작업 - Calendar클래스 
public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal2);
		Date d = new Date();
		System.out.println(d);
		System.out.println("=============================Calendar사용방법=======================");
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print((cal.get(Calendar.MONTH)+ 1)+"월 "); //Month는 0부터 index
		System.out.print(cal.get(Calendar.DATE)+"일 ");
		System.out.print(cal.get(Calendar.HOUR)+"시 ");
		System.out.print(cal.get(Calendar.MINUTE)+"분 ");
		System.out.print(cal.get(Calendar.SECOND)+"초 ");
		cal2.set(2023, 10, 30);
		System.out.println(cal2);
		//설정된 날짜시간객체의 값을 millisecond로 변환
		System.out.println(cal.getTimeInMillis());
		
		//dday - 오늘부터 10월 30일까지 dday를 계산해보기
		
		Calendar today = new GregorianCalendar();
		Calendar dday = Calendar.getInstance();
		dday.set(2023, 9, 30);
		long time = dday.getTimeInMillis() - today.getTimeInMillis();
		System.out.println("D-day : "+(time /1000/60/60/24) );
		
	}

}
