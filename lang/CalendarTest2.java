package api.lang;

import java.util.Calendar;

public class CalendarTest2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		System.out.println(cal.get(Calendar.AM_PM));
		if(cal.get(Calendar.AM_PM)==Calendar.PM) {
			System.out.println("오후");
		}else {
			System.out.println("오전");
		}
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //요일 index -유일하게 1부터 시작
		System.out.println(Calendar.SUNDAY); //일요일부터 1
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.SATURDAY);
	}
}
