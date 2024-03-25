import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        // 소문자>대문자, A<Z<a<b
        String answer = "";
        char[] arrS = s.toCharArray();
        char[] arrAnswer = arrS.clone();
        
        Arrays.sort(arrS);
        
        for (int i=arrS.length-1, j=0; i>=0; i--, j++) {
            arrAnswer[j] = arrS[i];
        }
        
        answer = String.valueOf(arrAnswer);
        
        return answer;
    }
}

// 소요시간 : 18분