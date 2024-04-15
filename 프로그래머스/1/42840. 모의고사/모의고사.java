import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        // 수포자들의 찍는 패턴
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
        // 각 수포자들의 점수를 저장할 변수
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;

        // 각 수포자들의 점수 계산
        for(int i = 0; i < answers.length; i++) {
            if(one[i % one.length] == answers[i]) {
                countOne++;
            }
            if(two[i % two.length] == answers[i]) {
                countTwo++;
            }
            if(three[i % three.length] == answers[i]) {
                countThree++;
            }
        }

        // 가장 높은 점수 계산
        int max = Math.max(Math.max(countOne, countTwo), countThree);

        // 가장 높은 점수를 받은 수포자들을 저장할 리스트
        List<Integer> result = new ArrayList<>();

        // 가장 높은 점수를 받은 수포자들을 리스트에 추가
        if(max == countOne) {
            result.add(1);
        }
        if(max == countTwo) {
            result.add(2);
        }
        if(max == countThree) {
            result.add(3);
        }

        // 리스트를 배열로 변환하여 반환
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}