class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		int start = min(a, b);
		int end = max(a, b);
		for (int i = start; i <= end; i++)
			answer += i;
		return answer;
	}

	public int min(int a, int b) {
		if (a > b)
			return b;
		else
			return a;
	}

	public int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
}
