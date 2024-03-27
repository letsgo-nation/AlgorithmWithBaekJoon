// import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}
        
        
//         int rows = arr1.length;
//         int cols = arr1[0].length;
        
//         int[][] answer = new int[rows][cols];
        
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 answer[i][j] = arr1[i][j] + arr2[i][j];
//             }
//         }
        
//         return answer;
//     }
// }

// 1hr
