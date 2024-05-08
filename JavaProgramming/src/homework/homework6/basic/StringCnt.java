package homework.homework6.basic;

import java.util.Scanner;

public class StringCnt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요.");
		String userStr = sc.nextLine();
		
		int indexGa = 0;
		int indexBa = 0;
		
		for(int i = 0; i < userStr.length(); i++) {
			if(userStr.charAt(i) == '가')
				indexGa++;
			else if(userStr.charAt(i) == '바')
				indexBa++;
		}
		
		if(indexGa == 0 && indexBa == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
			System.exit(0);
		}
		
		System.out.println("가: " + indexGa +"개, " + "바: " + indexBa + "개");
		
	}

}
