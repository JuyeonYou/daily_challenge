import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
         ArrayList<Integer> list = new ArrayList<>();
        
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}	
		
		if(list.size() == 0) {
			int[] answer = {-1};
			return answer;
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			Collections.sort(list);
			answer[i] = list.get(i);
		}
		return answer;
    }
}
