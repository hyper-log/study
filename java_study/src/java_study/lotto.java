package java_study;

import java.util.Arrays;

public class lotto {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];

		for(int i=0; i<lotto.length; i++) {
			int random = (int)(Math.random()*45)+1;
			lotto[i]=random;
			
				for(int j=0; j<i; j++) {
					if(lotto[j]==random) {
						i--;
						break;
					}
				}
		}
		
		System.out.println(Arrays.toString(lotto));

	}
}
