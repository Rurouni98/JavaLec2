package homework.homework5.middle;

public class RemoveDup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Remove("aaabbccab"));
	}
	
	public static String Remove(String str) {
		int index = 0;
		int[] removeIndex = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			
			boolean dup = false;
			
			for(int j = i; j < str.length(); j++) {
				if(i == j) {
					continue;
				}
				
				if(str.charAt(i) == str.charAt(j)) {
					dup = true;
				}
				
				if(dup) {
					removeIndex[index++] = j; 
					dup = false;
				}
			}
			
			for(int x = 0; x <= index; x++) {
				if(removeIndex[x] == i + 1) {
					i++;
					x = 0;
					continue;
				}
				
			}
			
		}
			
			int removeLength = str.length() - index;
			char[] removeDup = new char[removeLength];
			
			index = 0;
			
			for(int k = 0; k < removeLength; k++) {
				for(int l = 0; l < removeLength; l++) {
					if(k == removeIndex[l]) {
						continue;
					}
					
				}
				
					removeDup[index] = str.charAt(k);
			}
			
		
		return String.valueOf(removeDup);
		
	}

}

