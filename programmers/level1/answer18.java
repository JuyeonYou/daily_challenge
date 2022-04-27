class Solution {
    public String solution(String s) {
        String answer = "";
      
    int l = (s.length() - 1) / 2;
		if (s.length() % 2 == 0) {
			answer += s.charAt(l);
			answer += s.charAt(l + 1);
		} else {
			answer += s.charAt(l);
		}
        return answer;
    }
}
