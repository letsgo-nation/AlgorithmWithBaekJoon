class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        // 1. for 문 돌려서 배열 위치마다 곱하고 더하기
        for(int i=0; i<a.length; i++) {
            answer = answer + a[i]*b[i];
        }
        return answer;
    }
}

// 소요시간 : 6분