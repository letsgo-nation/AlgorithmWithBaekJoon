import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        // Arrays.sort -> lowest* -> for -- [] -> p*m
        Arrays.sort(score); 
        for(int i=score.length-1; i>=0; i--) {
            stack.add(score[i]);
            if(stack.size()==m) {
                answer += stack.peek() * m;
                stack.clear();
            }
        }
        return answer;
    }
}