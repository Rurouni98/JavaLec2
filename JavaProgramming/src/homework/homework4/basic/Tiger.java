package homework.homework4.basic;

public class Tiger extends CatSort {
	public Tiger() {
		super();
	}
	
	@Override
	public void eat() {
		System.out.println("사냥감을 잡아먹다.");
	}
	
	@Override
	public void jump() {
		System.out.println("사냥감에게 달려들다.");
	}
	
}
