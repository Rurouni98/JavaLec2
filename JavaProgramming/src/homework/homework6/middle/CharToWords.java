package homework.homework6.middle;

public class CharToWords {
	public static void main(String[] args) {
		char[] mess = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
		
		String str1 = "";
		String str2 = "";
		String str3 = "";
		String str4 = "";
		
		for(int i = 0; i < mess.length; i++) {
			if(i % 4 == 0)
				str1 += mess[i];
			else if(i % 4 == 1)
				str2 += mess[i];
			else if(i % 4 == 2)
				str3 += mess[i];
			else
				str4 += mess[i];
		}
		
		System.out.println(str1 + ", " + str2 + ", " + str3 + ", " + str4);
	}
}
