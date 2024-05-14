package homework.homework10.basic;

import java.util.List;
//4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만
//출력하는 메소드 void printArr을 구현하세요.
public class _04_MultiplesOf3 {
	public <T> void printArr(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i > 0 && i % 3 == 0)
				System.out.println(arr[i]);
		}
	}
}
