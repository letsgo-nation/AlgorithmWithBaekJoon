import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
       int[] temp = new int[lottos.length];
        int[] answer = new int[2];

        // 같은 수 찾기
        int sameNum = 0;
        int zero = 0;
        for(int i : lottos) {
            if(i==0) {
                zero++;
            }
            for(int j : win_nums) {
                if(i==j) {
                    sameNum++;
                }
            }
        }
        answer[0] = rank(sameNum+zero);
        answer[1] = rank(sameNum);

        return answer;
    }
    public int rank(int n) {
        switch(n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}