package homework.homework10.middle;
//3. 커피 메뉴를 갖는 enum을 생성하고 AMERICANO, LATTE, MOCHA, COLDBREW 4개로 지정한다.
//가격이 값이 되고 순서대로 2000, 3000, 4000, 4500으로 지정한다.
//메뉴의 총 가격을 계산하는 추상 메소드를 정의하고 각각의 상수에서 구현하는데
//아메리카노(아이스 300 추가), 라떼(아이스 500 추가), 모카(휘핑 1000 추가), 콜드브루(시럽 200 추가)
//모든 메뉴 옵션 없는 주문은 지정한 가격대로 진행된다.
//totalPrice(int optionOrder, int normalOrder) 옵션 추가 잔수와
//일반 메뉴 잔수를 받아서 각 메뉴의 가격을 계산하는 추상 메소드 구현한다.
//아아 2잔 뜨아 1잔 아라 1잔 휘핑 모카 2잔 콜드브루 2잔일 때의 가격을 출력하세요.
public enum _03_CoffeeMenu {
	AMERICANO(2000) {
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * 300 + normalOrder * 2000;
		}
	},
	LATTE(3000){
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * 500 + normalOrder * 3000;
		}
	},
	MOCHA(4000){
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * 1000 + normalOrder * 4000;
		}
	},
	COLDBREW(4500){
		public int totalPrice(int optionOrder, int normalOrder) {
			return optionOrder * 200 + normalOrder * 4500;
		}
	};
	
	private int price;
	
	_03_CoffeeMenu(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public abstract int totalPrice(int optionOrder, int normalOrder);
}
