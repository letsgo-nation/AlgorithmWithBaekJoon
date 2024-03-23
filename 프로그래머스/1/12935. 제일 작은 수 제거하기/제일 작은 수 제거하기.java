import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        String[] strArr = new String[arr.length];
        int[] answer = new int[arr.length-1];

        for (int i=0; i<arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        int[] clonedArr = arr.clone();
        Arrays.sort(clonedArr);
        String smallestNum = String.valueOf(clonedArr[0]);

        strArr = Arrays.stream(strArr)
                .filter(x -> !x.equals(smallestNum))
                .toArray(String[]::new);

        for (int i=0; i<arr.length-1; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        if (answer.length==0) {
            return new int[] {-1};
        } else {
            return answer;
        }
    }
}

// 소요시간 : 54분