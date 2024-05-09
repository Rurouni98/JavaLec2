package homework.homework8.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTwinMax {
//	3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력해주세요.");
			intList.add(sc.nextInt());
		}
		
		int index = 0;
		
		for(int i = 0; i < intList.size() - 2; i++) {
			if(intList.get(i) + intList.get(i + 1) < intList.get(i + 1) + intList.get(i + 2)) {
				index = i + 1;
			}
		}
		
		System.out.println(intList + " => " + intList.get(index) + ", " + intList.get(index + 1));
		
	}

}
