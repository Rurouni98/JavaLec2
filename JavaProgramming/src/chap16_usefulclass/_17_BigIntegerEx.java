package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 까지 곱한 값을 구하세요. (100 팩토리얼, 100!)
		
		BigInteger num = BigInteger.valueOf(1);
		// BigInteger.ONE도 가능
		
		for(int i = 1; i < 100; i++) {
			num = num.multiply(BigInteger.valueOf(i + 1));
		}
		
		System.out.println(num);
		
		long num2 = factorial(10);
		
		System.out.println(num2);
		System.out.println(factorialBigInteger(BigInteger.valueOf(100)));
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + "! = " + factorialBigInteger(BigInteger.valueOf(i)));
		}
		
		// 1! factorialBigInteger(BigInteger.valueOf(1))
		// 2! factorialBigInteger(BigInteger.valueOf(2))
		// 3! factorialBigInteger(BigInteger.valueOf(3))
		// ..
		// 100! factorialBigInteger(BigInteger.valueOf(3))
		
	}

	public static long factorial(long num) {
		if(num == 0) {
			return 1;
		} else {
			//재귀메소드: 현재 메소드를 구현부안에서 호출
			// num = 10 이 들어오면
			// 10 * factorial(9)
			// 10 * 9 * factorial(8)
			// ....
			// 10 * 9 * 8 * 7 * ... * factorial(0)
			return num * factorial(num - 1);
		}
	}
	
	public static BigInteger factorialBigInteger(BigInteger BigInt) {
		if(BigInt == BigInteger.ZERO) {
			return BigInteger.ONE;
		} else {
			return BigInt.multiply(factorialBigInteger(BigInt.subtract(BigInteger.ONE)));
		}
	}
	
}
