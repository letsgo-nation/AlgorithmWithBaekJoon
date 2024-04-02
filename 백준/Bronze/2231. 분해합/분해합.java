import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < n; i++) {
            int number = i;
            int sum = 0;	// 각 자리수를 더한 값을 저장하는 변수

            while(number != 0) {
                sum += number % 10;	// 각 자릿수 더하기
                number /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if(sum + i == n) { // 현재 i 값과 해당 자리수를 누적 더한 값과 같을때
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}



// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());