import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
		
        Arrays.sort(lost);
		Arrays.sort(reserve);
		answer = n - lost.length;
		
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = reserve[j] = -1;
				}
			}
		}

		for (int i : lost) {
			for (int j = 0; j < reserve.length; j++) {
				if (i == reserve[j] + 1 || i == reserve[j] - 1) {
					answer++;
					reserve[j] = -1;
                    break;
				}
			}
		}
        return answer;
    }
}
