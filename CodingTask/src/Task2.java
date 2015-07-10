import java.util.Arrays;


public class Task2 {

	public static void main(String[] args) {
		
		int[] A = {2, 4};
		int[] B = {1, 2};
		Task2 two =  new Task2();
		System.out.println(two.solution(A, B));
//		System.out.println(Long.parseLong("12345"));
//		System.out.println(one.solution(139));

	}
	
	//1 2 3 4 5 6
	//4 5 9
	//1 2 3 4 
	public int solution(int[] A, int[] B) {
        
		Arrays.sort(A);
		Arrays.sort(B);
		
		int minValue = -1;
		
		int bIndex = 0;
		
		for(int i = 0; i < A.length; i++) {
			if(bIndex >= B.length) {
				break;
			}
			if(A[i] == B[bIndex]) {
				minValue = A[i];
				break;
			}
			
			if(A[i] > B[bIndex]) {
				i--;
				bIndex++;
			}
		}
		return minValue;
    }

}
