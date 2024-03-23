class Solution {
    public String solution(String[] seoul) {
        String str1 = "김서방은 ";
        String str2 = "에 있다";
        String x = "";
        
        for (int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                x = String.valueOf(i);
            }
        }
    
        String answer = str1+x+str2;
        return answer;
    }
}

// 소요시간 :  48분
// return x (the location of Kim in array);