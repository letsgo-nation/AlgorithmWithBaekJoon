import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 개수를 입력받음
        int num = Integer.parseInt(br.readLine());

        // 동적 계획법을 위한 배열 선언 및 초기화
        int[] array = new int[11];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;

        int a = 0;
        for (int i = 0; i < num; i++) {
            // 각 테스트 케이스의 값을 입력받음
            a = Integer.parseInt(br.readLine());

            // 동적 계획법을 사용하여 결과 계산
            for (int j = 4; j <= a; j++) {
                array[j] = array[j - 1] + array[j - 2] + array[j - 3];
            }

            // 결과 출력
            System.out.println(array[a]);
        }

        // BufferedReader를 사용한 후에는 닫아주어야 함
        br.close();
    }
}
