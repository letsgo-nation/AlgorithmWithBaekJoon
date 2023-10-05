import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static long dp[][];
    
    public static long dp(int n, int m) {
        if(n == 0 || m == 0) return 0;
        if(n == 1 && m == 1) return 1;
        if(dp[n][m] != -1) return dp[n][m];
        
        long result = (dp(n, m-1) + dp(n-1, m) + dp(n-1, m-1))%1000000007;
        dp[n][m] = result;
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        dp = new long[n+1][m+1];
        for(int i=0; i<=n; i++)
            for(int j=0; j<=m; j++)
                dp[i][j] = -1;
        
        System.out.println(dp(n, m)%1000000007);
        
        br.close(); // BufferedReader를 사용한 후에는 꼭 닫아주어야 합니다.
    }
}
