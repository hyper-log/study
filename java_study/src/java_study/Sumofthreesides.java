package java_study;

import java.util.Arrays;

public class Sumofthreesides {
	
	/*삼각형의 가장 긴 변이 나머지 두 변의 합보다 작아야 한다, 프로그래머스 문제 테스트*/
	
	public static void main(String[] args) {
		Sumofthreesides sth = new Sumofthreesides();
		int[] sides= {3, 6, 2};
		int answer = sth.solution(sides);
		System.out.println(answer);
	}
	
	public int solution(int[] sides) {
		int answer=0;
		Arrays.sort(sides);
		System.out.println(Arrays.toString(sides));
		
		if(sides[0]+sides[1]>sides[2]) {
			answer=1;
		}else {
			answer=2;
		}
		return answer;
	}
}
