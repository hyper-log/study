package java_study;

public class maxmin {
	
	//최대값, 최소값 구하기

	public static void main(String[] args) {
		
		int num[] = {5, 10, 15, 3, 4};
		int max=0;
		int min=0;
		
		/* 최대값 */
		for(int i=0; i<num.length; i++) {
			if(num[i]>num[0]) {
				int temp = num[0];
				num[0] = num[i];
				num[i] = temp;
				max=num[0];
			}
		}	
		
		/* 최소값 */
		for(int i=0; i<num.length; i++) {
			if(num[i]<num[0]) {
				int temp = num[0]; 
				num[0] = num[i];
				num[i] = temp;
				min=num[0];
			}
		}
			
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
