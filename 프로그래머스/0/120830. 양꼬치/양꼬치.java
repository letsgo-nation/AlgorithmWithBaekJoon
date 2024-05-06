class Solution {
    public int solution(int n, int k) {
            for(int i=1; i*10<=n; i++){
                if(i*10>=10){
                k=k-1;
            }
        }
        return n*12000+k*2000;
    }
}