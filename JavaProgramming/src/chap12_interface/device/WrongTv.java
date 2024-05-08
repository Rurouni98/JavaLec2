package chap12_interface.device;

public interface WrongTv {
	default void turn() {
		System.out.println("오류 발생.");
	}
}
