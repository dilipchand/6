
public class EquilibriumIndex {

	
	public static void main(String args[]) {
		int[] A = {0,3,-4,5,1,-6,2,1};
		EquilibriumIndex e = new EquilibriumIndex();
		System.out.println(e.solution(A));
	}
	
	public int solution(int[] A) {
		Integer equilibirum = 0;
		
		int leftsum = A[0]; 
		int rightsum = 0;
		
		for(int i = 2; i < A.length; i++) {
			rightsum = rightsum + A[i];
		}
		
		for(int i = 1; i < A.length; i++) {
			if(leftsum == rightsum) {
				equilibirum = i;
			} else {
				leftsum = leftsum + A[i];
				rightsum = rightsum - A[i+1];
			}
		}
		
		for(int i = 2; i < A.length; i++) {
			for(int j = i; j < A.length; j++) {
				rightsum = rightsum + A[j];
			}
			if(leftsum == rightsum) {
				equilibirum = i;
				break;
			} else {
				
			}
			rightsum = 0;
		}
		return equilibirum;
    }
	
}
