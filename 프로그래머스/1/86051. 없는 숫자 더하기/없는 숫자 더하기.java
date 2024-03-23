import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for (int i=0; i<=9; i++) {
            if(!Arrays.toString(numbers).contains(String.valueOf(i))) 
                answer += i;
        }
        return answer;
    }
}