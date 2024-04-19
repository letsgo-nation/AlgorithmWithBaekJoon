class Solution {
    public int solution(int n, int m, int[] section) {
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