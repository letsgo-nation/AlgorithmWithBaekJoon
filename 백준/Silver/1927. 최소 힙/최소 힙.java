import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim()); // 연산의 개수
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int operation = Integer.parseInt(br.readLine().trim());

            if (operation == 0) { // 배열에서 가장 작은 값 출력 및 제거
                if (minHeap.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(minHeap.poll());
                }
            } else { // 자연수를 배열에 추가
                minHeap.offer(operation);
            }
        }

        br.close();
    }
}
