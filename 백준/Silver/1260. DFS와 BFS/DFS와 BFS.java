import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static ArrayList<Integer>[] graph;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 정점의 개수
        int M = Integer.parseInt(input[1]); // 간선의 개수
        int V = Integer.parseInt(input[2]); // 시작 정점

        // 그래프 초기화
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        visited = new boolean[N + 1];

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            graph[u].add(v);
            graph[v].add(u);
        }

        // 각 정점의 인접 리스트 정렬 (문제에서 "정점 번호가 작은 것을 먼저 방문"하도록 요구)
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS 탐색 및 출력
        dfs(V);
        System.out.println();

        // BFS 탐색 및 출력
        visited = new boolean[N + 1]; // BFS를 위해 방문 여부 초기화
        bfs(V);
    }

    // DFS 탐색
    private static void dfs(int node) {
        if (visited[node]) return;
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    // BFS 탐색
    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
