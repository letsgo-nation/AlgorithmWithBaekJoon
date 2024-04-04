import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        // 현재 배열 복사
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i];
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                // 인덱스 n의 문자를 기준으로 비교하여 정렬
                if (answer[i].charAt(n) > answer[j].charAt(n)) {
                    String temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
                // 만약 인덱스 n의 문자가 같다면 사전순으로 정렬
                if (answer[i].charAt(n) == answer[j].charAt(n)) {
                    if (answer[i].compareTo(answer[j]) > 0) {
                        String temp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = temp;
                    }
                }
            }
        }

        return answer;
    }
}