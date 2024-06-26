package chap17_usefulclass;

import java.util.Calendar;

public class _02_DiffTwoDate {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2019, 2, 11); // 2019년 3월 11일
		
		// getTimeInMills(): 현재 날짜 시간을 밀리세컨드로 변환(long)
		// 두 날짜의 차이 = 날짜1.getTimeInMills() - 날짜2.getTimeInMills() (long) 밀리초
		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		
		System.out.println("cal2부터 cal1까지 " + (diff / 1000) + "초가 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60) + "분이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60) + "시간이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60 / 24) + "일이 지났습니다."); // 여기부터 부정확
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60 / 24 / 30) + "달이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60 / 24 / 30 / 12) + "년이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60 / 24 / 365) + "년이 지났습니다.");
		
		// diff가 몇년 몇일 몇시간 몇분 몇초가 지났는지 표시하세요.
		long year = diff / ((long)1000 * 60 * 60 * 24 * 365);
		diff %= ((long)1000 * 60 * 60 * 24 * 365);
		
		long date = diff / ((long)1000 * 60 * 60 * 24);
		diff %= ((long)1000 * 60 * 60 * 24);
		
		long hour = diff / ((long)1000 * 60 * 60);
		diff %= ((long)1000 * 60 * 60);
		
		long minute = diff / ((long)1000 * 60);
		diff %= ((long)1000 * 60);
		
		long second = diff / (long)1000;
		
		System.out.println(year + "년 " + date + "일 " + hour + "시간 " + minute + "분 "
				+ second + "초가 지났습니다.");
		
	}

}
