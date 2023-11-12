import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int N = Integer.parseInt(br.readLine());

        // 입력된 문자열을 공백을 기준으로 나누기
        String[]rememberNumberStrings = br.readLine().split(" ");

        // 문자열 배열을 정수 배열로 변환
        int[] remNum = new int[rememberNumberStrings.length];
        for (int i = 0; i < rememberNumberStrings.length; i++) {
            remNum[i] = Integer.parseInt(rememberNumberStrings[i]);
        }

        // 정렬된 결과를 저장할 배열 만들기
        int[] line = new int[N];

        // 사람들의 기억 정보를 바탕으로 결과 배열 채우기
        // 2중 for문으로 결과 배열 채열 넣기
        for (int i = 0; i < N; i++) {
            int cnt = 0; // 결과 배열의 요소를 채우기 위해 현재 위치에서 개수 세기
            for (int j = 0; j < N; j++) {
                if (cnt == remNum[i] && line[j] == 0) {
                    line[j] = i + 1;
                    break;
                }
                if (line[j] == 0) {
                    cnt++;
                }
            }
        }

        // 결과 배열 출력
        for (int value : line) {
            System.out.print(value + " ");
        }
    }
}
