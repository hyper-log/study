package java_study;
import java.util.*;

public class moneyself {
	public static void main(String[] args) {
		/* 10만원짜리 수표가 들어가는 자판기를 만들려고 합니다.
		 * 자판기에 수표를 입력하면 거스름돈을 계산하여 정확하게 필요한 화폐들의 개수를 계산하여야 합니다.
		 * 이를 계산하는 프로그램을 작성하시오.
		 * 예시: 99990 원 > 50000원 1개, 10000원 4개, 5000원 1개, 1000원 4개, 500원 1개, 100원 4개, 50원 1개, 10원 4개
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("input");
		int charge = Integer.parseInt(sc.nextLine());
		
		System.out.println("50000원 " + (charge/50000) + "개");
		charge = charge % 50000;
		
		System.out.println("10000원 "+ (charge/10000) + "개");
		charge = charge % 10000;
		
		System.out.println("5000원 "+ (charge/5000) + "개");
		charge = charge % 5000;
		
		System.out.println("1000원 "+ (charge/1000) + "개");
		charge = charge % 1000;
		
		System.out.println("500원 "+ (charge/500) + "개");
		charge = charge % 500;
		
		System.out.println("100원 "+ (charge/100) + "개");
		charge = charge % 100;
		
		System.out.println("50원 "+ (charge/50) + "개");
		charge = charge % 50;
		
		System.out.println("10원 "+ (charge/10) + "개");
		charge = charge % 10;
		

		System.out.println("");
	}
}
