class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for(int i=1, f; i<food.length; i++) {
            if (food[i]/2==1){
                left.append(i);
                right.append(i);
            } else if(food[i]/2>=2){
                for(int j=1; j<=food[i]/2; j++){
                    left.append(i);
                    right.append(i);
                }
            }
        }
        left.append(0);
        right.reverse();
        left.append(right);
        return String.valueOf(left);
    }
}