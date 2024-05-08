package chap12_interface.device;

public interface Tv extends Display, Speaker {
	void changeChannel(int channel);
	
	default void turn() {
		System.out.println("시스템을 킨다.");
	}
}
