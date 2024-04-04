class Solution {
    public int solution(String s) {
    
        String[] numArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i=0; i<numArr.length; i++) {
            if(s.contains(numArr[i])) {
                s = s.replace(numArr[i], String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }
}