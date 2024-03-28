import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i<100; i++) {
            stack.push(n%3);
            n=n/3;
            if (n<1) {
                break;
            }
        }
        int range = stack.size();
        for (int i=0; i < range; i++) {
                answer += (int) (stack.pop()*Math.pow(3,i));
        }
        return answer;
    }
}