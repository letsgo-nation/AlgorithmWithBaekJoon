import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int minusOne = 0; // i + i-1 + i-3
        int minusTwo = 0; // i + i-2

        int[] arr = new int[301];
        int[] dp = new int[301];

        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        for(int i=3; i<=N; i++) {
            minusOne = arr[i] + arr[i-1] + dp [i-3];
            minusTwo = arr[i] + dp[i-2];

            dp[i] = Math.max(minusOne,minusTwo);

        }
        System.out.println(dp[N]);
    }
}
