package homework.homework7.middle;

public class BitRepeat {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		
		int remainBuffer = sb.capacity() - sb.length();
		
		for(int i = 0; i < remainBuffer; i++) {
			if(i % 3 == 0)
				sb.append('b');
			else if(i % 3 == 1)
				sb.append('i');
			else if(i % 3 == 2)
				sb.append('t');
		}
		
		System.out.println(sb);
	}

}
