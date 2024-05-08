package homework.homework5.middle;

public class RemoveDup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Remove("aaabbccab"));
	}
	
	public static String Remove(String str) {
		StringBuilder sb = new StringBuilder();
		
		if(str == null) {
			System.out.println("문자를 입력해주세요.");
			System.exit(0);
		}
		
		for(char i : str.toCharArray()) {
			if(sb.indexOf(String.valueOf(i)) == -1) {
				sb.append(i);
			}
		}
		
		return sb.toString() ;
		
	}

}

