import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물품의 수
        int K = Integer.parseInt(st.nextToken()); // 배낭의 최대 무게

        int[] weights = new int[N]; // 각 물건의 무게
        int[] values = new int[N];  // 각 물건의 가치

        // 물건의 무게와 가치 입력 받음
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }

        // dp 배열 초기화
        int[][] dp = new int[N + 1][K + 1];

        // 물건을 하나씩 고려하여 최대 가치 계산
        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= K; w++) {
                // 현재 물건을 배낭에 넣을 수 있는 경우
                if (weights[i - 1] <= w) {
                    // 현재 물건을 넣을지 말지 결정하여 더 큰 가치를 선택
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    // 현재 물건을 배낭에 넣을 수 없는 경우 이전 상태를 그대로 유지
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // 배낭에 넣을 수 있는 물건들의 가치합의 최댓값 출력
        System.out.println(dp[N][K]);
    }
}
