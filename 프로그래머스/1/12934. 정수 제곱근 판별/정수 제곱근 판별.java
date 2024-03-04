class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrtN = (long)Math.sqrt(n);
        
        if (n == (long)Math.pow(sqrtN, 2)) {
            answer = (long)Math.pow(sqrtN+1,2);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}