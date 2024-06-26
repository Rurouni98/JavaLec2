package chap19_generic;

import java.util.ArrayList;
import java.util.List;

import chap19_generic.ramyun.Danmuji;
import chap19_generic.ramyun.Gimchi;
import chap19_generic.ramyun.Ramyun;

public class _02_GenericClassRamyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ramyun<Danmuji> ramyun = new Ramyun<>();
		
		ramyun.setT(new Danmuji());
		
		System.out.println(ramyun.getT());
		
		List<Danmuji> danmujiList = new ArrayList<>();
		danmujiList.add(new Danmuji());
		danmujiList.add(new Danmuji("white"));
		
		ramyun.settList(danmujiList);
		
		for(Danmuji danmuji : danmujiList) {
			System.out.println(danmuji);
		}
		
		Ramyun<Gimchi> gimchiRamyun = new Ramyun<>();
		
		gimchiRamyun.setT(new Gimchi());
		
		System.out.println(gimchiRamyun.getT());
		
	}

}
