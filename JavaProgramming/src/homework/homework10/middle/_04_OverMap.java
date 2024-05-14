package homework.homework10.middle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//4. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요.
//매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고
//키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
public class _04_OverMap {
	public <K, V> List<Entry<K, V>> getOverHundr(Map<Integer, Integer> map) {
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Integer, Integer>> mapItr = entrySet.iterator();
		
		List<Entry<K, V>> entryList = new ArrayList<>();
		
		while(mapItr.hasNext()) {
			Entry<Integer, Integer> entry = mapItr.next();
			
			if(entry.getKey() * entry.getValue() > 1000) {
				entryList.add((Entry<K, V>) Map.entry(entry.getKey(),entry.getValue()));
			}
			
		}
		
		return entryList;
		
		
		
		
	}
}
