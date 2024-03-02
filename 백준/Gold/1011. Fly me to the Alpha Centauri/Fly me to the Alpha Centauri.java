import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0 ; i<T ; i++) {

            StringTokenizer st = new  StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distance = y-x;
            int max = (int)Math.sqrt(distance);
            int count = ((int)Math.sqrt(distance)*2)-1;

            if (max == Math.sqrt(distance)) {
                sb.append(count);
                sb.append('\n');
            } else if (distance <= max * max + max) {
                sb.append(count+1);
                sb.append('\n');
            } else {
                sb.append(count+2);
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}