class Solution {
    public int solution(int n, int m, int[] section) {
        // 1. 1~n
        // 2. 덧칠해야하는 부분
        // the lowest elemen+m 끊고 
        // 다시 
        // 2+4-1 =6
        // 10 4 {2,3,/ 6,7,9,/ 10} = 3
        int count = 1; 
        
        for(int i=1; i<section.length; i++) {
            if(section[i] > section[0] + m - 1) {
                count++; 
                section[0] = section[i];
            }
        }
        return count;
    }
}