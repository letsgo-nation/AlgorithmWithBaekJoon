import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // 이중 for문
        // 1. i~j번째 숫자 배열 - arr[]
        for(int a=0; a<commands.length; a++) {
            int iToJLength = commands[a][1]-commands[a][0]+1;// i+j까지의 길이
            int[] arr = new int[iToJLength];
            for(int b=0; b<iToJLength; b++) {
                arr[b] = array[commands[a][0]-1+b];
            }
            // 2. 배열 정렬 
            Arrays.sort(arr);
            // 3. k 번째 숫자 반환
            answer[a] = arr[commands[a][2]-1];
        }
        return answer;
    }
}
