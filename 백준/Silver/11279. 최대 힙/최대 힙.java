import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 연산의 개수

        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                // 배열에서 가장 큰 값 출력 및 제거
                if (max.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(max.poll());
                }
            } else {
                // 배열에 자연수 x를 넣음
                max.offer(x);
            }
        }

        br.close();
    }
}