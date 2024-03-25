class Solution {
    public int solution(int left, int right) {
        
        int[] arr = new int[right-left+1];
        int[] arr1 = arr.clone();
        arr[0] = left;
        int count = 0;
        int answer = 0;

        for (int i=1; i<arr.length; i++) {
            arr[i] = arr[i-1]+1;
        }
        for (int i=0; i<arr.length; i++) {
            for (int j=1;j*j<=arr[i];j++) {
                if(arr[i]%j==0) {
                    count = count+1;
                    if (j!=arr[i]/j) {
                        count = count+1;
                    }
                }
            }
            arr1[i] = count;
            count = 0;
        }
        for(int i=0; i<arr.length ; i++) {
            if(arr1[i]%2==1) {
                arr[i] = -arr[i];
            }
            answer = answer + arr[i];
        }
        return answer;
    }
}

//  소요시간 : 45분