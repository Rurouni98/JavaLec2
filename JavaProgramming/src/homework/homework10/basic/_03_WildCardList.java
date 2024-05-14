package homework.homework10.basic;

import java.util.List;

//3. public static Integer sum(List<?> list) 와일드 카드를 이용하여
//리스트의 총합을 구하는 메소드를 구현하세요.
public class _03_WildCardList {
	public static Integer sum(List<?> list) {
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += (int)list.get(i);
		}
		
		return sum;
	}
}
