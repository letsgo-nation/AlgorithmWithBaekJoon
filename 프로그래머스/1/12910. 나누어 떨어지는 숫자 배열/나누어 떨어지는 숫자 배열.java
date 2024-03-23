import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        // divisor로 나누어 떨어지는 값을 담을 배열 생성
        int[] answer = Arrays.stream(arr)
                            .filter(x -> x % divisor == 0) // divisor로 나누어 떨어지는 값 필터링
                            .sorted() // 정렬
                            .toArray(); // 배열로 변환
        
        // divisor로 나누어 떨어지는 값이 없는 경우
        if (answer.length == 0) {
            return new int[]{-1};
        }
        
        return answer; 
    }
}
