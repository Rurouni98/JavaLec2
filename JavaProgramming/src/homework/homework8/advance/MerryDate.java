package homework.homework8.advance;

import java.util.Calendar;

public class MerryDate {
//	1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//    2022년의 결혼기념일 날짜를 구하세요.
	public static void main(String[] args) {
		Calendar merryDate = Calendar.getInstance();
		merryDate.set(2001, 11, 19);
		
		for(int i = 0; i < 21; i ++) {
			if(isLeapYear(merryDate.get(Calendar.YEAR) + 1)) {
				merryDate.add(Calendar.DATE, 1);
			} 
			
			merryDate.add(Calendar.YEAR, 1);
		}
		
		System.out.println(merryDate.get(Calendar.YEAR) + "년 " +
							(merryDate.get(Calendar.MONTH) + 1) + "월 " +
							merryDate.get(Calendar.DATE) + "일"
				);
		
	}

	public static boolean isLeapYear(int year) {
		// 윤년의 조건
		// 년도가 400으로 나누어떨어지거나 4로는 나누어 떨어지고, 100으로는 나눠떨어지지 않는 년도
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
