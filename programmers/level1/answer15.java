class Solution {
    public long solution(long n) {
        long answer = 0;
       
        long sqrt = (long) Math.sqrt(n);
  		  answer = n == sqrt * sqrt ? (long) Math.pow(sqrt+1, 2) : -1;
       
        return answer;
    }
}
