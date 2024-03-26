class Solution {
    public long solution(int price, int money, int count) {
    
        long value = 0;
        long[] arrAnswer = new long[count];
        long answer = 0;
        
        for (int j = 1; j <= count; j++) {
            value = (long) price * j;
            arrAnswer[j-1] = value;
            answer += arrAnswer[j-1];
        }
        if (money>answer) {
            answer = 0;
        } else {
            answer = answer-money;
        }  
        return answer;
    }
}

// 소요시간 : 47분