import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int M = Integer.parseInt(br.readLine()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        // 그래프를 나타내는 인접 리스트를 생성
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 네트워크 연결 정보를 읽어서 그래프를 만듭니다.
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            graph[a].add(b);
            graph[b].add(a);
        }

        // 방문 여부를 저장하는 배열
        boolean[] visited = new boolean[N + 1];

        // DFS를 이용한 웜 바이러스 전파 탐색
        Stack<Integer> stack = new Stack<>();
        stack.push(1); // 1번 컴퓨터부터 시작
        visited[1] = true;
        int count = 0; // 웜 바이러스에 걸리는 컴퓨터 수를 저장하는 변수

        while (!stack.isEmpty()) {
            int current = stack.pop();
            count++;

            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        System.out.println(count - 1); // 1번 컴퓨터 자체는 웜 바이러스에 걸린 것으로 세지 않음
    }
}
