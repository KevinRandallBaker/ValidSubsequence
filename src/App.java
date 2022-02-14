import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> testCases = new ArrayList<List<Integer>>();
		List<List<Integer>> sequences = new ArrayList<List<Integer>>();
		
		Integer[] test0 = {10, 5, 6, -6, 8, 5};
		Integer[] sequence0 = {6, -6, 8};
		
		testCases.add(Arrays.asList(test0));
		sequences.add(Arrays.asList(sequence0));
		
		System.out.print("test0: ");
		System.out.println(validateSubsequence(testCases.get(0), sequences.get(0)));

	}
	
	public static boolean validateSubsequence(List<Integer> array, List<Integer> sequence) {
		
		int arrIdx = 0;
		int seqIdx = 0;
		
		while(arrIdx < array.size() && seqIdx < sequence.size()) {
			if(array.get(arrIdx).equals(sequence.get(seqIdx))) {
				seqIdx++;
			}
			arrIdx++;
			
		}
		return seqIdx == sequence.size();
	}

}
