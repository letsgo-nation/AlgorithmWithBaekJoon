import java.util.*;
import java.io.*;

// 행과 열을 반복해서 각 칸에 이동 가능한 만큼의 경로의 수를 누적하기
class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //2차원 배열 dp를 선언
        long[][] dp = new long[N+1][N+1];

        // 시작점인 dp[1][1]을 1로 초기화
        dp[1][1] = 1;

        // 격자판의 행을 나타내는 반복문
        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 한 행 내의 각 열에 대한 반복
            for(int j=1; j<=N; j++) {
                // num : 현재 위치에서 이동할 수 있는 칸의 수
                int num = Integer.parseInt(st.nextToken());
                if(num == 0) // 0이라면 현재 위치에서 이동할 수 있는 경로가 없으므로 다음 열로 이동
                    continue;

                // 현재 위치 (i, j)에서 오른쪽으로 num만큼 이동한 위치에, 현재 위치 (i, j)까지의 경로의 수를 누적
                if(j + num <= N)
                    dp[i][j+num] += dp[i][j];

                // 현재 위치 (i, j)에서 아래쪽으로 num만큼 이동한 위치에, 현재 위치 (i, j)까지의 경로의 수를 누적
                if(i + num <= N)
                    dp[i+num][j] += dp[i][j];
            }
        }
        System.out.println(dp[N][N]);
        br.close();
    }
}