package chap20_enum.enums;

public enum RGB {
	// RED, GREEN, BLUE 상수선언
	// 값은 4개를 갖는다
	// 첫 번째 값은 소문자 색상이름
	// 두 번째, 세 번째, 네 번째 값은 int형
	// 두 번째 값은 빨간색 농도(255가 최대값)
	// 세 번째 값은 초록색 농도(255가 최대값)
	// 네 번째 값은 파란색 농도(255가 최대값)
	// enum을 구현하세요.
	
	RED("red", 255, 0, 0) {
		public void printColorNum() {
			
		}
	},
	GREEN("green", 0, 255, 0){
		public void printColorNum() {
			
		}
	},
	BLUE("blue", 0, 0, 255){
		public void printColorNum() {
			
		}
	},
	BLACK("black", 0, 0, 0){
		public void printColorNum() {
			
		}
	},
	WHITE("white", 255, 255, 255){
		public void printColorNum() {
			
		}
	};
	
	private String color;
	private int redVal;
	private int greenVal;
	private int blueVal;
	
	RGB(String color, int redVal, int greenVal, int blueVal) {
		this.color = color;
		this.redVal = redVal;
		this.greenVal = greenVal;
		this.blueVal = blueVal;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getRedVal() {
		return this.redVal;
	}
	
	public int getGreenVal() {
		return this.greenVal;
	}
	
	public int getBlueVal() {
		return this.blueVal;
	}
	
	public abstract void printColorNum();
	
}
