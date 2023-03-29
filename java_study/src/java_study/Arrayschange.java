package java_study;

import java.util.Arrays;

public class Arrayschange {
	/*배열 자리 바꾸기*/
	public static void main(String[] args) {
		int[] num = {3, 5, 1, 2};
		
	
		int n=(int)(Math.random()*4);
		System.out.println(n);
		for(int i=0; i<num.length; i++) {
			int temp=num[i];
			num[i]=num[n];
			num[n]=temp;
		}
		System.out.println(Arrays.toString(num));
	}
}
