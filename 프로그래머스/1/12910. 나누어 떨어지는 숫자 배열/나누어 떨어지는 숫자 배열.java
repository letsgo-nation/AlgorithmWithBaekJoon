import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        Queue<Integer> que = new LinkedList<>();

        for (int i=0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                que.add(arr[i]);
                count++;
            }
        }
        
        if (count==0) {
            return new int[] {-1};
        }
        
        int[] answer = new int[count];
        for(int i=0; i<count; i++) {
            answer [i] = que.poll();
        }
        answer = Arrays.stream(answer).sorted().toArray();
        return answer;
    }
}
