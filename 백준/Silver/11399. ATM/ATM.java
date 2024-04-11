import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String P = br.readLine();
        String[] arrP = P.split(" ");
        int[] time = new int[N];

        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(arrP[i]);
        }

        // 시간을 오름차순으로 정렬
        Arrays.sort(time);

        int sum = 0;
        int waitTime = 0;

        // 각 사람이 돈을 인출하는데 필요한 시간의 합 계산
        for (int i = 0; i < N; i++) {
            waitTime += time[i]; // 해당 사람이 돈을 인출하는데 걸리는 시간
            sum += waitTime; // 해당 사람까지의 총 대기 시간을 더함
        }

        System.out.println(sum);
    }
}
