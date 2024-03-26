class Solution {
    public boolean solution(String s) {
        boolean answer = true;
          
        // s의 길이가 4 또는 6
        if (!(s.length()==4 || s.length()==6)) {
            answer = false;
        }
        
        // 1. chartAt()을 활용하여 숫자 체크하기
//        for(int i=0; i<s.length(); i++) {
//            if (!('0' <= s.charAt(i) && s.charAt(i) <= '9')) {
//                answer = false;
//            }
//        }

        // 2. isDigit() 함수 활용하기
        char check;

        for(int i=0; i<s.length(); i++) {
            check = s.charAt(i);

            if (!Character.isDigit(check)) {
                answer = false;
            }
        }
        return answer;
    }
}

// 소요시간 : 50분 고민 후 검색 