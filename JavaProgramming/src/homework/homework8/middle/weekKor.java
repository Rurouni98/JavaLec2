package homework.homework8.middle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class weekKor {
//	2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		String[] weeks = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력해주세요. (yyyy-MM-dd)");
		
		String userDate = sc.nextLine();
		
		try {
			cal.setTime(sdf.parse(userDate));
			
			System.out.println(weeks[cal.get(Calendar.DAY_OF_WEEK)]);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
