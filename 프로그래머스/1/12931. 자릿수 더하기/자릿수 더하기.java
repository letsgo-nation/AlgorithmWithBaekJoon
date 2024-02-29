import java.util.*;

public class Solution {
    public int solution(int n) {
        
        // 숫자 n을 String로 변환 -> String을 하나씩 뽑는다. -> String을 Int로 변환 -> +=
        int answer = 0;
        String stringN = String.valueOf(n);
        for (int i=0; i< stringN.length() ;i++) {
            answer += Integer.parseInt(String.valueOf(stringN.charAt(i)));
        }
      return answer;
    }
}