package homework.homework5.middle;

public class Reverse {
	String reverseString(String str) {
		char[] reverseArr = new char[str.length()];
		int index = str.length() - 1;
		
		for(int i = 0; i < str.length(); i++) {
			reverseArr[i] = str.charAt(index--);
		}
		
		return String.valueOf(reverseArr);
	}
}
