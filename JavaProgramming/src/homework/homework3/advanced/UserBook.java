package homework.homework3.advanced;

import homework.homework3.basic.User;

public class UserBook {
	
	User[] userArr = new User[100];
	
	int index = 0;
	
	public void saveUserInfo(String username, String password) {
		
		if(index >= 0 && index <= 99){
			User user = new User();
			
			user.setId(index + 1);
			user.setUsername(username);
			user.setPassword(password);
			
			userArr[index++] = user;
			
			System.out.println("현재 저장된 전화번호 수는 " + index + "개입니다.");
		} else {
			System.out.println("전화번호를 더 이상 저장할 수 없습니다.");
		}
		
	}
	
}
