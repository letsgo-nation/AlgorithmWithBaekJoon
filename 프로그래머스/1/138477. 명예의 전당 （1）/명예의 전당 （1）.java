import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int[] hallOfFame = new int[k];
        Arrays.fill(hallOfFame, Integer.MAX_VALUE); // 초기값을 최대값으로 설정

        for (int i = 0; i < score.length; i++) {
            if (i >= k) {
                // 명예의 전당에 이미 들어가 있는 점수 중 가장 작은 값을 찾아서 대체
                int min = Integer.MAX_VALUE;
                int minIndex = -1;
                for (int j = 0; j < k; j++) {
                    if (hallOfFame[j] < min) {
                        min = hallOfFame[j];
                        minIndex = j;
                    }
                }
                if (score[i] > min) {
                    hallOfFame[minIndex] = score[i];
                }
            } else {
                // 명예의 전당에 자리가 있는 경우 바로 추가
                hallOfFame[i] = score[i];
            }
            // 현재 명예의 전당에서 가장 작은 점수를 정답 배열에 저장
            Arrays.sort(hallOfFame); // 정렬 후 최하위 점수는 항상 첫 번째 값
            answer[i] = hallOfFame[0];
        }

        return answer;
    }
}
