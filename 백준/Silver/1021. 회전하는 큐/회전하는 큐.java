import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 큐에 처음에 포함되어 있던 수 N 저장
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++)
            deque.addLast(i);

        st = new StringTokenizer(br.readLine());
        int count = 0;

        // 뽑아내려고 하는 수의 개수 M 저장
        // 뽑고자 하는 수의 위치를 판단하여 연산
        for (int i = 0; i < M; i++) {
            int location = Integer.parseInt(st.nextToken());

            ArrayDeque<Integer> deque1 = new ArrayDeque<>(deque);
            ArrayDeque<Integer> deque2 = new ArrayDeque<>(deque);

            int leftCount = 0;
            while (deque1.getFirst() != location) {
                int a = deque1.pollFirst();
                deque1.addLast(a);
                leftCount++;
            }

            int rightCount = 0;
            while (deque2.getFirst() != location) {
                int a = deque2.pollLast();
                deque2.addFirst(a);
                rightCount++;
            }

            if (leftCount < rightCount) {
                count += leftCount;
                deque = deque1;
            } else {
                count += rightCount;
                deque = deque2;
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}