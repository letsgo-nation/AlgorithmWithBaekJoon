class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        // 배열 크기 비교
        if(arr1.length != arr2.length) {
            if(arr1.length > arr2.length) {
                return 1;
            } else {
                return -1;
            }
        } else { // 배열 크기가 같다면 원소 합계 크기 비교
            int sum1 = 0;
            int sum2 = 0;
            for(int value : arr1){
                sum1 += value;
            }
            for(int value : arr2){
                sum2 += value;
            }
            if(sum1>sum2) {
                return 1;
            } else if (sum1<sum2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}