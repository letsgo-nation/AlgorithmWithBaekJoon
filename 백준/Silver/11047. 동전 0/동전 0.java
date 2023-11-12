import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 첫째 줄에서 N과 K 입력 받기
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        // 동전 개수의 최솟값
        int minCount = 0;

        // 둘째 줄부터 N개의 줄에 동전의 값 Ai 입력 받기
        int[] coins =new int[N];
        for (int i = 0; i < N ; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        // 동전 갯수 최솟값 구하는 로직
        for (int i = coins.length -1 ; i >= 0; i--) {

            // 배열 중 K에 속하는 최대 값을 점점 빼주면서 동전 갯수 올리기
            while (coins[i] > 0 && K >= coins[i]) {
                K-= coins[i];
                minCount ++;
            }
        }
        System.out.println(minCount);
    }
}