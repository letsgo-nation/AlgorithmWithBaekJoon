import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666; // N과 비교하기 위한 변수
        String str = Integer.toString(num); // String 변환
        int cnt = 0; // N과 동일할 때 break 하기 위한 변수

        while(true) {
            if(str.contains("666")){
                cnt++;
            }
            if(cnt==n) {
                System.out.println(num);
                break;
            }
            num++;
            str = Integer.toString(num);
        }
    }
}
