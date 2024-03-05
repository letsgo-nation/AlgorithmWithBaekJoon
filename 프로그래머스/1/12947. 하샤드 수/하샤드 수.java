class Solution {
    public boolean solution(int x) {
        
        int sum = 0;
        boolean answer = true;

        String stringX = String.valueOf(x);
        int [] arrX = new int [stringX.length()];

        for (int i=0; i<stringX.length(); i++) {
            arrX [i] = Integer.parseInt(String.valueOf(stringX.charAt(i)));
        }
        for (int j=0; j<stringX.length(); j++) {
            sum+=arrX [j];
        }
        if (x%sum!=0) {
            answer = false;
        }
        return answer;
    }
}