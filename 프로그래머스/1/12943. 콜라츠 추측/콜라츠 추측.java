class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if (num==1) {
            return answer;
        }

        for (int i=1; i<501; i++) {
            if (num==1) {
                return answer;
            } else if (num%2==0) {
                num=num/2;
                answer = i;
            } else if (num%2==1) {
                num=num*3+1;
                answer = i;
            } else if (i==500) {
                answer = -1;
            }
        }
        return answer;
    }
}