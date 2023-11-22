import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

// DP 문제

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] DP = new int[N];
        Arrays.fill(DP, -1); // 모든 값을 -1로 초기화

        // 배열에 값 저장
        int[] as = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            as[i] = Integer.parseInt(st.nextToken());
        }

        // DP 배열을 채우기
        DP[0] = 0;
        // 배열의 각 위치를 순회하며 현재 위치에서 가능한 이동을 계산
        for (int i = 0; i < N - 1; i++) {
            if(DP[i] == -1) { // -1은 이동이 불가능, 계산을 건너뛰고 다음 위치로 진행
                continue;
            }
            // 현재 위치에서 가능한 이동 거리만큼 순회
            for (int j = 1; j <= as[i]; j++) {
                if(i + j < N) {
                    if (DP[i + j] == -1 || DP[i + j] > DP[i] + 1) {
                        DP[i + j] = DP[i] + 1;
                        // DP[i + j] == -1: 최소 이동 횟수 없는 상태
                        // 현재 위치에서의 이동 횟수(DP[i])에 1을 더한 값을 저장

                        // DP[i + j] > DP[i] + 1: 최소 이동 횟수는 있지만,
                        // 현재 위치에서 이동하여 도달하는 횟수가 더 적은 상태
                        // 해당 값을 갱신
                    }
                }
            }
        }
        System.out.println(DP[N - 1]);
        // DP [N-1] : 배열의 마지막 위치에 도달하는 데 필요한 최소 이동 횟수가 저장
    }
}