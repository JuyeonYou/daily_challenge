class Solution {
    public int[] solution(int[] arr) {
		int[] answer = arr.length == 1 ? new int[1] : new int[arr.length-1];
		if (arr.length == 1) {
			answer[0] = -1;
		} else {
            int min = arr[0];
            int minIndex = 0;
			for (int i = 0; i < arr.length; i++) {
				min = min > arr[i] ? arr[i] : min;
                if (min == arr[i]) {
					minIndex = i;
				}
			}
       for(int i=0; i<answer.length; i++) {
				if(i < minIndex) {
					answer[i] = arr[i];
				}else if(i >= minIndex) {
					answer[i] = arr[i+1];
				}
			}
		}
    return answer;
    }
}
