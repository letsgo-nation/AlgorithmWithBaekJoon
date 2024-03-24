class Solution {
    public String solution(int n) {
        String answer = "";
        // 1. 홀수는 수, 짝수는 박 선언
        // 2. 배열에 저장 및 반환

        String[] str = new String[n];
        for (int i=0; i<str.length; i++) {
            if (i % 2 == 0) {
                str[i] = "수";
            } else {
                str[i] = "박";
            }
            answer = answer.concat(str[i]);
        }
        return answer;
    }
}

// 소요시간 : 10분