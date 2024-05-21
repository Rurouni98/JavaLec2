package homework.homework11.basic;

public class _03_SyncThread01 extends Thread {
	private _030405_NumberPrinter np;

	public _030405_NumberPrinter getNp() {
		return np;
	}

	public void setNp(_030405_NumberPrinter np) {
		this.np = np;
	}
	
	@Override
	public void run() {
		np.numPrint1(1);
	}
	
}
