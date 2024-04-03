class Solution {
    public int solution(int left, int right) {
        
        int[] arr = new int[right-left+1]; // 두 정수 사이의 갯수 
        int[] arr1 = arr.clone();
        arr[0] = left;
        
        int count = 0;
        int answer = 0;

        for (int i=1; i<arr.length; i++) { // left, left+1, left+2...
            arr[i] = arr[i-1]+1;
        }
        // 약수가 짝수일 때 ++
        for (int i=0; i<arr.length; i++) {
            for (int j=1;j*j<=arr[i];j++) { // 제곱근까지 왔을 때 멈추기
                if(arr[i]%j==0) {
                    count = count+1;
                    if (j!=arr[i]/j) { //  서로 다른 두 약수를 찾기
                        count = count+1;
                    }
                }
            }
            arr1[i] = count;
            count = 0;
        }
        
        // 약수가 홀수일 때 --
        for(int i=0; i<arr.length ; i++) {
            if(arr1[i]%2==1) {
                arr[i] = -arr[i];
            }
        answer = answer + arr[i];
        }
        return answer;
    }
}