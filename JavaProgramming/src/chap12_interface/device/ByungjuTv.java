package chap12_interface.device;

public class ByungjuTv implements Tv, WrongTv {

	@Override
	public void showDisplay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		Tv.super.turn();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
