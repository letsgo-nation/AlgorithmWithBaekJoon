class Solution {
    public int[] solution(long n) {
        String stringN = String.valueOf(n);
        int answer [] = new int [stringN.length()];
        
        for (int i = stringN.length()-1, j=0; i>=0 ; i--, j++) {
            answer [j] = Integer.parseInt(String.valueOf(stringN.charAt(i)));
        }
        return answer;
    }
}
