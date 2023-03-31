package java_study;

import java.util.*;

public class PlayTheRockPaperScissors {
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("가위, 바위, 보 중 하나를 말씀해 주세요.");
			System.out.println("게임을 종료하고 싶다면 end 를 말씀해 주세요.");
			
			
			Scanner sc=new Scanner(System.in);
			
			String userskill=sc.next();
			
			if(userskill.equals("end")) {
				break;
			}
			
			int myturn = (int)(Math.random()*3)+1;
			
			if (myturn==1) {
				System.out.println("가위");
			}else if (myturn==2){
				System.out.println("바위");
			}else if (myturn==3){
				System.out.println("보");
			}
			
			if(userskill.equals("가위") && myturn == 1) {
				System.out.println("비겼습니다.");
			}else if(userskill.equals("가위") && myturn == 2) {
				System.out.println("당신이 이겼습니다.");
			}else if(userskill.equals("가위") && myturn == 3) {
				System.out.println("제가 이겼습니다.");
			}else if(userskill.equals("바위") && myturn == 1) {
				System.out.println("당신이 이겼습니다.");
			}else if(userskill.equals("바위") && myturn == 2) {
				System.out.println("비겼습니다.");
			}else if(userskill.equals("바위") && myturn == 3) {
				System.out.println("제가 이겼습니다.");
			}else if(userskill.equals("보") && myturn == 1) {
				System.out.println("제가 이겼습니다.");
			}else if(userskill.equals("보") && myturn == 2) {
				System.out.println("당신이 이겼습니다.");
			}else if(userskill.equals("보") && myturn == 3) {
				System.out.println("비겼습니다.");
			}
			
		}
	}//main-end
}//class-end
