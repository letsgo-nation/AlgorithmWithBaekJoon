import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
    public static final int MaxN = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n > MaxN) {
            System.out.println("n은 10000 이하여야 합니다.");
            return;
        }

        BigInteger[] dpN = new BigInteger[MaxN + 1];
        dpN[0] = BigInteger.ZERO;
        dpN[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            dpN[i] = dpN[i - 2].add(dpN[i - 1]);
        }

        System.out.println(dpN[n]);
    }
}
