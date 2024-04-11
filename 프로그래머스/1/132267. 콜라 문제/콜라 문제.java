class Solution {
    public int solution(int a, int b, int n) {
                int value = 0;
        int remain = 0;
        int sum = 0;
        // 값이 value
        // 값 += 나머지를 n에 더해서 나누기

        while(n/a>0) {
            // if doesn't have remain
            if(n%a==0) {
                value = (n/a)*b;
                n = value;
                sum += value;
            } else { // if remain exists,
                remain = n%a;
                value = (n/a)*b;
                sum += value;
                n = value;
                if(remain<=a) {
                    n = n+remain;
                }
            }
        }
        return sum;
    }
}