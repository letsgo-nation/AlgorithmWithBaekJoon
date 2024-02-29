class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n ; i++) {
            if (n%i==0){
            answer += i;
            }
        }
        return answer;
    }
}

//public class Main {
//     public static void main(String[] args) {
//         int n = 12;
//         int sum = 0;
//         for (int i = 1; i <= n ; i++) {
//             if (n%i==0){
//                 System.out.print(i);
//                 sum += i;
//                 System.out.println(sum);
//             }
//         }
//     }
// }