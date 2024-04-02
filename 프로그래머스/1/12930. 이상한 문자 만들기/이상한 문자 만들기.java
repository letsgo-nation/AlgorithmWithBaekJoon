import java.util.Arrays;

// 공백을 기준으로 짝홀수 확인 -> 대문자로 변환
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isEven = true; // 시작은 짝수로 설정

         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer.append(ch); // 공백은 그대로
                isEven = true; // 공백을 만나면 다음 문자는 다시 짝수로 시작
            } else {
                if (isEven) {
                    answer.append(Character.toUpperCase(ch)); // 짝수번째 문자는 대문자로
                } else {
                    answer.append(Character.toLowerCase(ch)); // 홀수번째 문자는 소문자로
                }
                isEven = !isEven; // 짝수, 홀수를 토글
            }
        }

        return answer.toString();
    }
}
