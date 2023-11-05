import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 돌 게임 규칙에 따라 상근이(SK)과 창영이(CY)의 승자를 판별
        if (n % 2 == 0) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
