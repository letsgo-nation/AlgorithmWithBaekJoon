class Solution {
    public int solution(int[] nums) {
        int check = 0;

        for(int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int total = nums[i]+nums[j]+nums[k];
                    int count = 0;
                    for(int n=1; n<=total; n++) {
                        if(total%n==0) {
                            count++;
                        }
                    }
                    if(count==2) {
                        check++;
                    }
                }
            }
        }
        return check;
    }
}