import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();

        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(!stack.contains(numbers[i] + numbers[j])) {
                    stack.add(numbers[i] + numbers[j]);
                }
            }
        }
        int[] answer = new int[stack.size()];
        int index = 0;
        for(int value : stack) {
            answer[index++] = value;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}