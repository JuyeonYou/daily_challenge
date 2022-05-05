class Solution {
    public int solution(int[][] sizes) {
      
        int answer = 0;
        int max_w = 0;
        int max_h = 0;
      
        for (int i = 0; i < sizes.length; i++) {
           int width = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1];
           int height = sizes[i][0] > sizes[i][1] ? sizes[i][1] : sizes[i][0];
           max_w = Math.max(max_w, width);
           max_h = Math.max(max_h, height);
        }
      
       answer = max_w * max_h;
      
       return answer;
   
    }
}
