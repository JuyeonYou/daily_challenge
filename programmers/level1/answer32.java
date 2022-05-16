import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				temp.add(array[j]);
			}
			Collections.sort(temp);
			answer[i] = temp.get(commands[i][2] - 1);
		}        
        return answer;
    }
}
