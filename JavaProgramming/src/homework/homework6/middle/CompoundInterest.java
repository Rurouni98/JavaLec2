package homework.homework6.middle;

public class CompoundInterest {

	public static void main(String[] args) {
		int firstMoney = 10000;
		
		for(int i = 1; i <= 10; i++) {
			firstMoney *= 1.1;
		}
		
		System.out.println(firstMoney);
	}

}
