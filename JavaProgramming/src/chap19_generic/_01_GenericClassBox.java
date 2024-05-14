package chap19_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import chap19_generic.box.Box;

public class _01_GenericClassBox {

	public static void main(String[] args) {
		// Box 객체를 생성할 때 타입매개변수(T)의 타입을 지정한다.
		// 지정한 타입매개변수의 타입에 따라서 객체의 형태가 바뀐다.
		Box<String> strBox = new Box<>("Java", "17");
		Box<Integer> intBox = new Box<>(1000, 2000);
		Box<Map<String, String>> mapBox = new Box<>(new HashMap<String, String>(), new HashMap<String, String>());
		
		
		strBox.add();
		intBox.add();
		mapBox.add();
		
		List<String> strList = new ArrayList<String>();
		
		
		// 파일, 파라미터, 형변환, Map<String, String> -> (Integer, String)
//		List<Map<String, Object>>
//		그리드		
//	[	
//		{ "이름" : "a1", "성씨" : "b1" , "회사명" : "c1"},
//		{ "이름" : "a2", "성씨" : "b2" , "회사명" : "c2"},
//		{ "이름" : "a3", "성씨" : "b3" , "회사명" : "c3"},
//		{ "이름" : "a4", "성씨" : "b4" , "회사명" : "c4"}
//	]
		
		
		
		
		
	}

}
