class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
  	int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int x = 0;
        for(int i = 0; i < a-1; i++){
            x += month[i];
        }
        x += b -1;
        answer = day[x % 7];
        return answer;
    }
}
