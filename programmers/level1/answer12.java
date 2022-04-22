import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String arr[] = String.valueOf(n).split("");
        int arr2[] = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
            answer += arr2[i];
        }
        return answer;
    }
}
