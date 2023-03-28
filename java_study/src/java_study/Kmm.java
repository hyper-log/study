package java_study;
import java.util.*;

public class Kmm {
	
	/* meter 를 입력받아, km과 m으로 출력해 주는 프로그램을 작성하시오. */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int meter = sc.nextInt();
		
		if(meter>=1000) {
			meter = meter/1000;
			System.out.println(meter+"km");
		}else {
			System.out.println(meter+"m");
		}
	}
	
}
