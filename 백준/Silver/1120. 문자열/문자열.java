import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 사용자로부터 입력받은 문자열을 공백으로 구분하여 토큰으로 분리

        // 입력 문자열에서 분리된 두 개의 토큰을 문자열 A와 B에 저장
        String A = st.nextToken();
        String B = st.nextToken();

        int minDifference = A.length(); // 차이 중에 최대값

        for (int i = 0; i <= B.length() - A.length(); i++) {
            // i 변수는 B 문자열을 순회하는 인덱스
            // A의 길이가 B의 길이와 같아질 때까지 실행

            int difference = 0; // 반복에서의 차이 값을 저장하는 difference 변수를 초기화
            for (int j = 0; j < A.length(); j++) {
                // j 변수는 A 문자열을 순회하는 인덱스

                if (A.charAt(j) != B.charAt(j + i)) { // A와 B의 해당 위치의 문자를 비교 && 다른 문자인 경우를 확인
                    difference++; // 다른 문자가 발견되면 difference 값을 증가
                }
            }
            minDifference = Math.min(minDifference, difference);
            // 현재까지의 최소 차이(minDifference)와 현재 차이(difference)를 비교하여 최소값을 선택
        }

        // A와 B의 길이가 같을 때의 차이를 출력합니다.
        System.out.println(minDifference);
    }
}
