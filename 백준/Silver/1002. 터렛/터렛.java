

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [] answer = new int [T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            if (x1 == x2 && y1 == y2 && r1 == r2) { // 두 원이 동심원이며 반지름이 같을 때
                answer[i] = -1;
            } else {
                int distance = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
                int plusR = (r1 + r2) * (r1 + r2);
                int minusR = (r1 - r2) * (r1 - r2);

                if (distance > plusR || distance < minusR) { // 두 원이 외부에서 만나지 않을 때
                    answer[i] = 0;
                } else if (distance == plusR || distance == minusR) { // 두 원이 외접하거나 내접할 때
                    answer[i] = 1;
                } else { // 두 점에서 만날 때
                    answer[i] = 2;
                }
            }
        }
        for (int i : answer) {
            System.out.println(i);
        }
        br.close();
    }
}
