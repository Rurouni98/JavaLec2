package test;

class Operator {
	int add(int a, int b) {
		int result = a + b;
		return result; 
	}
	
	int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	
	void convertChar(char a) {
		if (a >= 65 && a <= 90) {
			System.out.println((char)(a + 32));
		} else if(a >= 97 && a <= 122) {
			System.out.println((char)(a - 32));
		} else
			System.out.println("영문자가 아닙니다.");
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator a = new Operator();
		int test = a.add(1,3);
		
		System.out.println(test);
		

		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				int x = (10 * i) + j;
				int y = (10 * j) + i;
				
				if(x + y == 99) {
					System.out.print("A: " + i + ", ");
					System.out.print("B: " + j);
					System.out.println();
				}
			}
		}
	}

}
