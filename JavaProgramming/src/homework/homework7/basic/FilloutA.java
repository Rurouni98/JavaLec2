package homework.homework7.basic;

public class FilloutA {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		
		int remainBuffer = sb.capacity() - sb.length();
		
		for(int i = 0; i < remainBuffer; i++) {
			sb.append("a");
		}
		
		System.out.println(sb);
		
	}

}
