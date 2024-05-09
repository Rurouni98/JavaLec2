package homework.homework8.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OwnValueList {
//	4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("정수를 입력하세요.");
			intList.add(sc.nextInt());
		}
		
		List<Integer> addList = new ArrayList<>();
		
		for(int i = 0; i < intList.size() - 1; i++) {
			for(int j = intList.size() - 1; j > i; j--) {
				addList.add(intList.get(i) + intList.get(j));
			}
		}
		
		List<Integer> finalList = new ArrayList<>();
		
		for(int i = 0; i < addList.size(); i++) {
			if(Collections.frequency(addList, addList.get(i)) == 1) {
				finalList.add(addList.get(i));
			}
		}
		
		
		System.out.println("총 " + finalList.size()  + "개 ");

	}

}
