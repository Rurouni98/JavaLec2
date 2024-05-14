package homework.homework10.basic;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때
//길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
public class _06_MapGeneric {
	public <K, V> void printOverTen(Map<K, V> map) {
		Set<Entry<K, V>> mapSet = map.entrySet();
		Iterator<Entry<K,V>> mapItr = mapSet.iterator();
		
		while(mapItr.hasNext()) {
			Entry<K, V> mapEntry = mapItr.next();
			
			if(mapEntry.getValue().toString().length() >= 10)
				System.out.println(mapEntry.getKey());
		}
	}
}
