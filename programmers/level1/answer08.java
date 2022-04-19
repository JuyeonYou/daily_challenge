class Solution {
    public int[] solution(int n, int m) {
        	int[] answer = new int[2];

		int min = (n < m) ? n : m; // 둘 중에 작은 수
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}
		answer[0] = gcd; //최대공약수
		answer[1] = n * m / gcd; // 최소공배수
        return answer;
    }
}
