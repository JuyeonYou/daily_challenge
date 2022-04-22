class Solution {
    public int[] solution(long n) {
        
        String arr[] = String.valueOf(n).split(""); 
        int[] answer = new int[arr.length]; 
		
        for (int i = 0; i < arr.length; i++) {
			    for (int j = arr.length - 1; j >= 0; j--) {
			     	answer[i] = Integer.parseInt(arr[j]);
           i++;
		  	  }
	  	  }
        
        return answer;
    }
}
