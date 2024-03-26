class Solution {
    public boolean solution(String s) {
        boolean answer = true;
          
        if (!(s.length()==4 || s.length()==6)) {
            answer = false;
        }
        
        for(int i=0; i<s.length(); i++) {
            if (!('0' <= s.charAt(i) && s.charAt(i) <= '9')) {
                answer = false;
            }
        }
        return answer;
    }
}

// 소요시간 : 50분 고민 후 검색 