package homework.homework10.middle;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때
//key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
public class _01_getMaxMul {
	public <K,V> Entry<K, V> getMaxMul(Map<K, V> map) {
		Set<Entry<K, V>> mapSet = map.entrySet();
		Iterator<Entry<K, V>> mapItr = mapSet.iterator();
		
		int maxMul = 0;
		int index = 0;
		Entry<K, V> maxMulEntry = null;
		
		while(mapItr.hasNext()) {
			Entry<K, V> mapEntry = mapItr.next();
			int entryMul = (int)mapEntry.getKey() * (int)mapEntry.getValue();
			
			if(index == 0) {
				maxMul = entryMul;
			} else if(entryMul > maxMul) {
				maxMul = entryMul;
				maxMulEntry = mapEntry;
			}
			
			index++;
		}
		
		return maxMulEntry;
	}
}
