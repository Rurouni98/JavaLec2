package homework.homework4.advance;

public class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {
		int concatLength = s1.length + s2.length;
		int[] concat = new int[concatLength];
		
		for(int i = 0; i < concatLength; i++) {
			if(i < s1.length) {
				concat[i] = s1[i];
			} else {
				concat[i] = s2[i - s1.length];
			}
		}
		
		return concat;
		
	}
	
	static int[] remove(int[] s1, int[] s2) {
		int[] removeIndex = new int[s1.length];
		int index = 0;
		
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i] == s2[j]) {
					removeIndex[index++] = i;
					break;
				}
			}
		}
		
		int[] returnArr = new int[s1.length - index];
		
		index = 0;
		int returnIndex = 0;
		
		for(int k = 0; k < s1.length; k++) {
			if(removeIndex[index] == k)  {
				index++;
				continue;
			}
			
			returnArr[returnIndex++] = s1[k];
		}
		
		return returnArr;
		
	}
	
}
