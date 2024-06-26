package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _10_HashMapEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> intList2 = 
				new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
			
			for(int j = 0; j < i; j++) {
				if(intList2.get(i) == intList2.get(j)) {
					System.out.println("중복된 값입니다.");
					intList2.remove(i);
					i--;
				}
			}
		}
 		
		List<Integer> sumList = new ArrayList<>();
		
		Map<String, Integer> intMap = new HashMap<>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		
		System.out.println(sumList); // 확인용
		
		for(int i = 0; i < sumList.size(); i++) {
			int sumCnt = 1;
			
			for(int j = 0; j < sumList.size(); j++) {
				if(i != j) {
					if(sumList.get(i) == sumList.get(j)) {
						sumCnt++;
					} 
				}
			}
			
			intMap.put(String.valueOf(sumList.get(i)), sumCnt);
			// if문을 이용해서 밸류 값을 포함하고 있지 않을 때만 넣는 것도 가능
			
		}
		
		
		System.out.println(intMap);
		
		Set<Entry<String, Integer>> entrySet = intMap.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		int onlyValueCnt = 0;
		
		System.out.print("합이 유일한 합의 값: ");
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			if(entry.getValue().equals(1)) {
				System.out.print(entry.getKey() + ", ");
				onlyValueCnt++;
			}
		}
		
		System.out.println("유일한 합의 개수: " + onlyValueCnt + "개");
		
		
		/*	
		 * {
		 * 		"3": 1,
		 * 		"4": 2,
		 * 		"5": 2,
		 * 		"6": 2,
		 * 		...
		 * 		"11": 1
		 * 
		 * 
		 * 
		 * */
		
		sc.close();
	}
	
	public static boolean isLeap(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}
	
}
