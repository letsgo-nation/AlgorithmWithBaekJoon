import java.util.*;

class Solution {
    public String solution (String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queCards1 = new LinkedList<>();
        Queue<String> queCards2 = new LinkedList<>();
        String answer = "Yes";

        queCards1.addAll(Arrays.asList(cards1));
        queCards2.addAll(Arrays.asList(cards2));

        for(int i=0; i<goal.length; i++) {
            if(!goal[i].equals(queCards1.peek())) {
                if(!goal[i].equals(queCards2.peek())) {
                    answer = "No";
                    break;
                }
                queCards2.poll();
            } else {
                queCards1.poll();
            }
        }
        return answer;
    }
}