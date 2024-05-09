package homework.homework8.middle;

import java.util.Calendar;

public class DiffTwoDate {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(2023, 2, 15, 20, 31, 45);
		cal2.set(2021, 6, 8, 11, 58, 4);
		
		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		
		long hour = diff / ((long)1000 * 60 * 60);
		diff %= ((long)1000 * 60 * 60);
		
		long minute = diff / ((long)1000 * 60);
		diff %= ((long)1000 * 60);
		
		long second = diff / ((long)1000);
		diff %= (long)1000;
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초가 지났습니다.");
	}

}
