import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
	private void permute(int[] a, int k, HashSet<String> distinctNumbers) {
		if (k == a.length) {
			String str = "";
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
				str = str + a[i];
			}
			System.out.println();
			distinctNumbers.add(str);
		} else {
			for (int i = k; i < a.length; i++) {
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				permute(a, k + 1, distinctNumbers);
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
	}

	public static void main(String args[]) {
		
		int[] a = {1, 2, 1, 3};
		HashSet<String> distinctNumbers = new HashSet<String>();
		Task3 task3 = new Task3();
		//permute(a, 0, distinctNumbers);
		System.out.println(task3.solution(1213));

		//sc.close();

	}
	
	public int solution(int N) {
		char[] strInput = Integer.toString(N).toCharArray();
		int[] inputArray = new int[strInput.length];
		
		for(int i = 0; i < strInput.length; i++) {
			inputArray[i] = Integer.parseInt(new String(strInput[i]+""));
		}
		HashSet<String> distinctNumbers = new HashSet<String>();
		permute(inputArray, 0, distinctNumbers);
		return distinctNumbers.size();
    }

}