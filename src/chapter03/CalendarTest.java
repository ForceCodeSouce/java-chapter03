package chapter03;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		//팩토리 메소드!!!
		//Factory Pattern (Method) - 디자인 패턴
		Calendar cal = Calendar.getInstance();
		
		//Singleton Pattern
		printDate(cal);
		
		//날짜 세팅
		//Ex) 2020/12/25
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11);		//Month - 1
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		//cal.set(2007, 10, 18);
		cal.set(1989, 10, 22);	//날짜 설정!!!
		printDate(cal);
		
		cal.add(Calendar.DATE, 20000);
		printDate(cal);
		
	}
	
	public static void printDate(Calendar cal) {
		
		//final int i = 10;	//상수!!!
							//Class에 final을 붙이면 상속이 안된다.
		
		String[] days = {"일","월","화","수","목","금","토"};
		
		//년도
		int year = cal.get(Calendar.YEAR);
		
		//월(0~11), +1
		int month = cal.get(Calendar.MONTH);
		
		//일
		int date = cal.get(Calendar.DATE);
		
		//요일 : 1(일) ~ 7(토)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//시 
		int hour = cal.get(Calendar.HOUR);
		
		//분
		int minutes = cal.get(Calendar.MINUTE);
		
		//초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
	            year+ "년" +
	            (month + 1) + "월" +
	            date  + "일(" +
	            days[day-1] + "요일)" +
	            hour + "시" +
	            minutes + "분" +
	            second + "초");
	}

}
