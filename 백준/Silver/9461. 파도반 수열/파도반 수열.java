import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        long DP[] = new long[101];

        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 1;

        for(int i=0;i<T;i++) {
            int N = sc.nextInt();

            for(int j=3;j<=N;j++)
                DP[j] = DP[j-3]+DP[j-2];

            System.out.println(DP[N]);
        }
    }
}

