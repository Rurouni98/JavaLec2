package homework.homewrok9.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapInteger {

	public static void main(String[] args) {
		Map<String, Integer> convertMap = new HashMap<>();
		
		Set<Entry<String, Integer>> convertSet = convertMap.entrySet();
		Iterator<Entry<String, Integer>> convertItr = convertSet.iterator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳1을 입력해주세요.");
		String userKey = sc.nextLine();
		System.out.println("알파벳2를 입력해주세요.");
		String userValue = sc.nextLine();
		
		
		
	}

}
