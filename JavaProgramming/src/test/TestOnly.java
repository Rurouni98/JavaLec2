package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestOnly {
    public static void main(String[] args) {
    	List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++) {
			arrayList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 순차적으로 데이터를 넣는데 걸린 시간: " + 
				(endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++) {
			linkedList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 순차적으로 데이터를 넣는데 걸린 시간: " + 
				(endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime();
		
		
		
		endTime = System.nanoTime();
    	
    }
}