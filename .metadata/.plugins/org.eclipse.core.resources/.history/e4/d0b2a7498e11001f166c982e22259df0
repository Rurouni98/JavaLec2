package homework.homework5.middle;

public class IndexChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(change("aaaaaaaaaaaaaaaaaaa"));
	}
	
	public static String change(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			if((i > 0) && (i % 3 == 0) && (i % 5 == 0)) {
				sb.append("35");
				continue;
			} else if((i > 0) && (i % 3 == 0)) {
				sb.append("3");
				continue;
			} else if((i > 0) && (i % 5 == 0)) {
				sb.append("5");
				continue;
			}
			
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
		
	}
	
}
