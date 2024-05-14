package homework.homework10.basic;

import chap99_homework.homework10.COUNTRY;

public enum _07_Contries {
	KOR("한국", "불고기"),
	CHI("중국", "짜장면"),
	JAP("일본", "초밥"),
	USA("미국", "햄버거");
	
	private String country;
	private String food;
	
	_07_Contries(String country, String food) {
		this.country = country;
		this.food = food;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String getFood() {
		return this.food;
	}
	
	public void notifyFood(String country) {
		_07_Contries[] countryArr = _07_Contries.values();
		
		for(_07_Contries c : countryArr) {
			if(this.getCountry().equals(c))
				System.out.println(c.getCountry() + "의 대표음식은 " + c.getFood() + "입니다.");
		}
	}
}
