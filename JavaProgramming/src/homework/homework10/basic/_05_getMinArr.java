package homework.homework10.basic;

import java.util.List;

//5. Number를 상속받은 클래스타입의 배열만 받아서
//배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
public class _05_getMinArr {
	public int getMin(List<? extends Number> list) {
		int min = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(i == 0) {
				min = (int)list.get(i);
			} else if(min > (int)list.get(i)) {
				min = (int)list.get(i);
			}
		}
		
		return min;
	}
}
