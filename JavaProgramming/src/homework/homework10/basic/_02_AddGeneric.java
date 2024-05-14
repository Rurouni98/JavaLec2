package homework.homework10.basic;
//2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 
//매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
public class _02_AddGeneric {
	public static <T> String add(T t1, T t2) {
		return "" + t1 + t2;
	}
}
