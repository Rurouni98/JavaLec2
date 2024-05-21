package chap99_homework.homework11;

public class Thread1 extends Thread{
	private NumberPrinterWaitNotify np;

	public NumberPrinterWaitNotify getNp() {
		return np;
	}

	public void setNp(NumberPrinterWaitNotify np) {
		this.np = np;
	}
	
	@Override
	public void run() {
		np.numPrint1(20);
	}
}
