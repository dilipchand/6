
public class Test {

	public static void main(String[] args) {
	
		int[] A = {0,3,-4,5,1,-6,2,1};
		                    
		Integer equilibirum = 0;
		
		int leftsum = 0; 
		int rightsum = 0;
		for(int i = 1; i < A.length; i++) {
			for(int k = 0; k < i; k++) {
				leftsum = leftsum + A[k];
			}
			for(int j = i+1; j < A.length; j++) {
				rightsum = rightsum + A[j];
			}
			if(leftsum == rightsum) {
				equilibirum = i;
				break;
			}
			leftsum = 0;
			rightsum = 0;
		}
		System.out.println(equilibirum);

	}

}
