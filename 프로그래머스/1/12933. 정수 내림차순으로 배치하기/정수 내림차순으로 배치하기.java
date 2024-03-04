import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 정수를 문자열로 변환
        String strN = String.valueOf(n);
        
        // 문자열을 문자 배열로 변환
        char[] charArray = strN.toCharArray();
        
        // 문자 배열을 정수 배열로 변환
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        
        // 정수 배열을 내림차순으로 정렬
        Arrays.sort(intArray);
        StringBuilder sb = new StringBuilder();
        
        // 정렬된 배열을 역순으로 문자열에 추가
        for (int i = intArray.length - 1; i >= 0; i--) {
            sb.append(intArray[i]);
        }
        
        // StringBuilder를 문자열로 변환하여 long으로 파싱 후 반환
        return Long.parseLong(sb.toString());
    }
}
