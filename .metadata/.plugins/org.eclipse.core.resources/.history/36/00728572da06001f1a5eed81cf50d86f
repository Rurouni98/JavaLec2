package homework;

public class _02_Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArr = {'y', 'B', 'c', 'D'};
		
		System.out.println(revChar(charArr));;
	}
	
	// 1번 문제
	public static int[] revArr(int[] numArr) {
		int[] revArr = new int[numArr.length - 1];
		
		for(int i = numArr.length - 1; i > 0; i--) {
			revArr[numArr.length - i - 1] = numArr[i];
			}
		
		return revArr;
	}
	
	// 2번 문제
	public static char[] revChar(char[] charArr) {
		char[] revChar = new char[charArr.length];
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] >= 'a' && charArr[i] < 'z') {
				revChar[i] = (char) Character.toUpperCase(charArr[i] + 1);
			} else if (charArr[i] == 'z') {
				revChar[i] = 'A';
			} else if (charArr[i] >= 'A' && charArr[i] < 'Z') {
				revChar[i] = (char) Character.toLowerCase(charArr[i] - 1);
			} else if (charArr[i] == 'A') {
				revChar[i] = 'z';
			}
			
		}
		
		return revChar;
	}
	
}


