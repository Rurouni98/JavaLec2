package homework.homework11.basic;
//2. 1번 문제에서 join()메소드를 이용해서
//서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.
public class _02_JoinThread {
	public static void main(String[] args) {
		Thread subThread = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 20; i++) {
					if(30 % i == 0)
						System.out.println("서브스레드: " + i);
				}
			}
		};
		
		subThread.start();
		
		try {
			subThread.join();
		} catch(InterruptedException ie) {
			System.out.println();
		}
		
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0 && i % 4 == 0)
				System.out.println("메인스레드: " + i);
		}
	}
}
