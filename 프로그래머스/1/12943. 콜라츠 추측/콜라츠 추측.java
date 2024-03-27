// if num is even -> /2,
// if num is odd -> *3+1
// repeat until the value is 1

// if num is 1 -> answer is 0
// if the function repeats more than 500 times, return -1

class Solution {
    public int solution(int num) {
        int answer = 0;

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