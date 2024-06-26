package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import chap23_stream.card.CreditCard;

public class _09_MapToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);
		}
		
		// 1. mapToInt(람다식): Stream<제네릭> 타입의 스트림을 기본타입 스트림인 IntStream으로 변환
		// 변환할 때는 람다식의 결과 값으로 스트림을 구성한다.
		IntStream intStream = intList.stream()
				                     .mapToInt(num -> num * 2);
		
		intStream.forEach(num -> System.out.println(num));
		
		// 2. 기본타입 스트림인 IntStream, DoubleStream, LongStream,... 에는 집계함수가 존재한다.
		// sum() 모든 요소의 합을 쉽게 구할 수 있다.
		// average(): 모든 요소의 평균값
		// List<CreditCard> 생성하고
		// 최대한도만 모여있는 IntStream을 만들어서
		// 최대한도의 총합과 평균을 구하세요.
		
		List<CreditCard> cardList = new ArrayList<>();
		
		cardList.add(new CreditCard("카카오", "라이언카드", 1000));
		cardList.add(new CreditCard("삼성카드", "탭탭오", 2000));
		cardList.add(new CreditCard("신한카드", "드림카드", 3000));
		cardList.add(new CreditCard("삼성카드", "ID카드", 5000));
		cardList.add(new CreditCard("현대카드", "더블랙", 10000));
		cardList.add(new CreditCard("아멕스", "블랙카드", 100000));
		
		IntStream limitStream = cardList.stream()
										.mapToInt(list -> list.getLimit());
		
		IntStream limitStream2 = cardList.stream()
										 .mapToInt(list -> list.getLimit());
		        
		System.out.println("최대한도의 총합: " + limitStream.sum());
		// 생성된 스트림의 최종 단계 메소드가 사용됐으면 스트림은 닫히게 돼서 다시는 사용할 수 없다.
		System.out.println("최대한도의 평균: " + limitStream2.average().getAsDouble());
		
		
		// 파이프라인으로 구성하게 되면 각각 스트림을 생성해서 사용하기 때문에
		// 스트림이 닫힐 걱정없이 사용할 수 있다.
		int sum = cardList.stream()
						  .mapToInt(card -> card.getLimit())
						  .sum();
		
		double avg = cardList.stream()
							  .mapToInt(card -> card.getLimit())
							  .average()
							  .getAsDouble();
		
		System.out.println(sum + ", " + avg);
		
		

	}

}
