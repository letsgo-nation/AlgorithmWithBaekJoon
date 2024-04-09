import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        LinkedList<Character> link = new LinkedList<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(link.contains(ch)) {
                answer[i] = i-link.lastIndexOf(ch);
            } else {
                answer[i] = -1;
            }
            link.add(ch);
        }
        return answer;
    }
}