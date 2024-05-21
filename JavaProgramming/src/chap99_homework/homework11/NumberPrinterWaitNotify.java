package chap99_homework.homework11;

public class NumberPrinterWaitNotify {
	private int num;
	
	public synchronized void numPrint1(int a) {
		this.num = a;
		
		for(int i = this.num; i <= 50; i++) {
			if(i % 3 == 0) {
				System.out.println("print1 : " + i);
			} else {
				System.out.println("print1 실행");
			}
			
			notify();
				
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public synchronized void numPrint2(int a) {
		this.num = a;
		
		for(int i = this.num; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println("print2 : " + i);
				
			} else {
				System.out.println("print2 실행");
			}
			
			notify();
				
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
