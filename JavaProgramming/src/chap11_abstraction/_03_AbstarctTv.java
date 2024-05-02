package chap11_abstraction;

import chap11_abstraction.tv.LgTv;
import chap11_abstraction.tv.SamsungTv;
import chap11_abstraction.tv.Tv;

public class _03_AbstarctTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.operate(11);
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		
		tv = new SamsungTv();
		tv.powerOn();
		tv.operate(23);
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}

}
