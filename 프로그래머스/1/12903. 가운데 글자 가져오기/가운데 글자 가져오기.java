class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 1. 문자열을 char 배열로 변환 + 저장 
        // 2. 배열 갯수가 짝수이면 /2 번째 캐릭 가져오기 <> 홀수이면 /2 2개의 캐릭 가져오기
        
        // // 1-1. 반복문
        // char[] charS = new char [s.length()];
        // for (int i=0; i<s.length(); i++) {
        //     charS[i] = s.charAt(i);
        // }
        
        // 1-2. toCharArray
        char[] charS = s.toCharArray();
        
        // 짝수&홀수 함수
        if (s.length()%2==0) {
            answer = String.valueOf(charS[s.length()/2-1]) + String.valueOf(charS[s.length()/2]);
        } else {
            answer = String.valueOf(charS[s.length()/2]);
        }
        return answer;
    }
}

// 소요시간 : 15분