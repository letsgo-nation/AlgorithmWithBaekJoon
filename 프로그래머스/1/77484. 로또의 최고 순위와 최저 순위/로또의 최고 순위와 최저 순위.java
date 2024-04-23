import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
                int[] temp = new int[lottos.length];
        int[] answer = new int[2]; // 당첨 가능한 최고 순위와 최저 순위 1~6

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        // 같은 수 찾기
        int sameNum = 0;
        int zero = 0;
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i]==0) {
                zero++;
            }
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i]==win_nums[j]) {
                    temp[sameNum++] = lottos[i];
                }
            }
        }
        // sameNum = 최저 순위
        if(sameNum==6) {
            answer[1] = 1;
        } else if(sameNum==5) {
            answer[1] = 2;
        } else if(sameNum==4) {
            answer[1] = 3;
        } else if(sameNum==3) {
            answer[1] = 4;
        } else if(sameNum==2) {
            answer[1] = 5;
        } else {
            answer[1] = 6;
        }

        // sameNum + 0의 개수 = 최고 순위
        if(sameNum+zero==6) {
            answer[0] = 1;
        } else if(sameNum+zero==5) {
            answer[0] = 2;
        } else if(sameNum+zero==4) {
            answer[0] = 3;
        } else if(sameNum+zero==3) {
            answer[0] = 4;
        } else if(sameNum+zero==2) {
            answer[0] = 5;
        } else {
            answer[0] = 6;
        }
        return answer;
    }
}