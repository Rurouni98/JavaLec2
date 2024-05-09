package homework.homework8.middle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatEx {
//	1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//    yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//    parse() 메소드를 이용하면 String -> Calendar로 변환가능)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력해주세요. (yyyy-MM-dd)");
		String userDate = sc.nextLine();
		
		SimpleDateFormat userSdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		
		Date date;
		try {
			date = userSdf.parse(userDate);
			cal.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		cal.add(Calendar.DATE, 3);
		
		Date userDateAdd3 = new Date(cal.getTimeInMillis());
		
		SimpleDateFormat sdfFinal = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdfFinal.format(userDateAdd3));

	}

}
