package chap23_stream;

import java.util.ArrayList;
import java.util.List;

import chap23_stream.card.CreditCard;

public class _04_PipeLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * List<CreditCard> 생성
		 * 
		 * 카카오, 라이언카드, 1000
		 * 삼성카드, 탭탭오, 2000
		 * 신한카드, 드림카드, 3000
		 * 삼성카드, ID카드, 5000
		 * 현대카드, 더블랙, 10000
		 * 아멕스, 블랙카드, 100000
		 * 
		 * */
		// 1. 스트림 파이프라인을 통해서 최대한도가 5000이상인 카드정보를 출력
		// (최종처리로 forEach 사용, cardInfo 메소드 호출)
		
		List<CreditCard> cardList = new ArrayList<>();
		
		cardList.add(new CreditCard("카카오", "라이언카드", 1000));
		cardList.add(new CreditCard("삼성카드", "탭탭오", 2000));
		cardList.add(new CreditCard("신한카드", "드림카드", 3000));
		cardList.add(new CreditCard("삼성카드", "ID카드", 5000));
		cardList.add(new CreditCard("현대카드", "더블랙", 10000));
		cardList.add(new CreditCard("아멕스", "블랙카드", 100000));
		
		cardList.stream() // Stream<CreditCard>
				//최대 한도가 5000이상인 CreditCard 객체만 모은 Stream<CreditCard>
				.filter(card -> card.getLimit() >= 5000)
				//최종단계 메소드
				//forEach로 출력
				.forEach(overFiveCard -> overFiveCard.cardInfo());
		
	}

}