import java.util.Arrays;


public class Task1 {

	public static void main(String[] args) {
		
		Task1 one = new Task1();
		System.out.println(Long.parseLong("12345"));
		System.out.println(one.solution(139));

	}
	
	public int solution(int N) {
        
/*		char[] strInput = Integer.toString(N).toCharArray();
		int[] inputArray = new int[strInput.length];
		
		for(int i = 0; i < strInput.length; i++) {
			inputArray[i] = Integer.parseInt(new String(strInput[i]+""));
		}
		
		Arrays.sort(inputArray);
		
		String maxVal = "";
		
		for(int i = inputArray.length; i > 0; i--) {
			maxVal = maxVal + inputArray[i-1];
		}
		System.out.println(maxVal);
		return Integer.parseInt(maxVal);*/
		
		char[] strInput = Integer.toString(N).toCharArray();

		Arrays.sort(strInput);
		
		String maxVal = "";
		
		for(int i = strInput.length; i > 0; i--) {
			maxVal = maxVal + strInput[i-1];
		}
		System.out.println(maxVal);
		return Integer.parseInt(maxVal);
    }

}
