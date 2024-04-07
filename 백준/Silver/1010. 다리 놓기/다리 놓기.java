import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int[][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]); // 서쪽 사이트 개수
            int M = Integer.parseInt(input[1]); // 동쪽 사이트 개수

            memo = new int[M + 1][N + 1]; // 메모이제이션을 위한 배열 초기화
            int result = combination(M, N);

            System.out.println(result);
        }

        br.close();
    }

    // 조합 계산 메소드
    public static int combination(int n, int r) {
        if (memo[n][r] > 0) { // 이미 계산한 값이 있다면 해당 값 반환
            return memo[n][r];
        }
        
        if (r == 0 || n == r) {
            memo[n][r] = 1;
            return 1;
        } else {
            memo[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
            return memo[n][r];
        }
    }
}
