package homework.homework5.middle;

public class IndexChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(change("aaaaaaaaaaaaaaaaaaa"));
	}
	
	public static String change(String str) {
		char[] charArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			if((i > 0) && (i % 3 == 0) && (i % 5 == 0)) {
				charArr[i] = '3';
				continue;
			} else if((i > 0) && (i % 3 == 0)) {
				charArr[i] = '3';
				continue;
			} else if((i > 0) && (i % 5 == 0)) {
				charArr[i] = '5';
				continue;
			}
			
			charArr[i] = str.charAt(i);
		}
		
		return String.valueOf(charArr);
		
	}
	
}
