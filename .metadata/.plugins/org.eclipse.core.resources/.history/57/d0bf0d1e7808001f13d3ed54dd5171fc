package homework;

import java.util.Random;
import java.util.Scanner;

public class _02_Advance {
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();
	
	private boolean isExit = false;
	private int gameCnt = 0;
	private int winCnt = 0;
	private int drawCnt = 0;
	private int loseCnt = 0;
	
	// 게임을 시작하는 메소드
	public void start() {
		
		do {
			System.out.println("가위바위보 시작!(3 입력 시 종료)");
			String userChoice = sc.next();
			int com = rd.nextInt(3);
			int user = 0;
			
			
			if(userChoice.equals("3")){
				isExit = true;
				continue;
			}
			
			if(userChoice.equals("가위")) {
				user = 0;
			} else if(userChoice.equals("바위")) {
				user = 1;
			} else if(userChoice.equals("보")) {
				user = 2;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			printCom(com);
			judgeWDL(user, com);
			gameCnt++;
			
		} while(!isExit);
		
		System.out.println("가위바위보가 종료됩니다.");
		System.out.print(gameCnt + "전 " + winCnt + "승 " + drawCnt + "무 " + loseCnt + "패입니다.");

	}
	
	// 승무패 판단해주는 메소드
	public void judgeWDL(int user, int com) {
		
		if(user == com) {
			System.out.println("비겼습니다.");
			drawCnt++;
		}
		
		if((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
			System.out.println("졌습니다.");
			loseCnt++;
		}
		
		if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
			System.out.println("이겼습니다!");
			winCnt++;	
		}
		
	}
	
	// 컴퓨터 가위, 바위, 보 출력해주는 메소드
	public void printCom(int com) {
		if(com == 0) {
			System.out.println("컴퓨터: 가위");
		} else if (com == 1) {
			System.out.println("컴퓨터: 바위");
		} else if (com == 2) {
			System.out.println("컴퓨터: 보");
		}
	}
	
}