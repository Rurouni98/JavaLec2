package homework.homework8.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTwinMax {

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
