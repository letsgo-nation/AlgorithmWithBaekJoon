import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    // 원하는 값 dp[k] = dpA + " " + dpB

    public static final int MaxK = 45; // k<=45 조건 성립

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        if (K < 1 || K > MaxK) { // 예외처리
            System.out.println("K는 1이상 45이하여야합니다.");
            return;
        }

        // dp [] 초기화 및 46개 요소 생성
        long [] dpA = new long [MaxK + 1];
        long [] dpB = new long [MaxK + 1];

        dpA[0] = 1; // 초기 A값 설정
        dpB[0] = 0; // 초기 B값 설정

        // A의 개수와 B의 개수 구하기
        for (int i=1; i<=K ; i++) {
            dpA[i] = dpB[i-1];
            dpB[i] = dpB[i-1] + dpA[i-1];
        }

        System.out.println(dpA[K] + " " + dpB[K]);

    }
}