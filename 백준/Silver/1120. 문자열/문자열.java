import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력으로 주어진 문자열 A와 B를 읽습니다.
        String A = st.nextToken();
        String B = st.nextToken();

        int minDifference = Integer.MAX_VALUE;

        // A의 길이가 B의 길이보다 작을 때, A와 B의 길이가 같아질 때까지 알파벳을 추가합니다.
        for (int i = 0; i <= B.length() - A.length(); i++) {
            int difference = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(j + i)) {
                    difference++;
                }
            }
            minDifference = Math.min(minDifference, difference);
        }

        // A와 B의 길이가 같을 때의 차이를 출력합니다.
        System.out.println(minDifference);
    }
}
