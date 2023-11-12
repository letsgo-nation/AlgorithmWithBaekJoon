import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 입력 받은 수식
        String cal = br.readLine();

        // 2. '-'를 기준으로 수식을 나누어 배열에 저장
        String[] parts = cal.split("-");

        // 첫 번째 수식을 빼지 않고 그대로 더함
        int minValue = calSum(parts[0]);


        // 4. 나머지 수식들을 빼서 최소 값을 계산
        for (int i = 1; i < parts.length; i++) {
            minValue -= calSum(parts[i]);
        }

        // 최종 결과 출력
        System.out.println(minValue);
    }

    // 3. 수식을 받아서 각 숫자의 합을 계산하는 메서드
    private static int calSum(String part) {
        // 3-1. '+'를 기준으로 수식을 나누어 배열에 저장
        // String 클래스의 split 메서드 - 문자열 part를 특정 구분자인 '+' 문자를 기준으로 여러 부분으로 나누는 역할
        String[] numbers = part.split("\\+");
        // numbers : 문자열을 나눈 후 얻은 부분 문자열을 저장하기 위한 문자열 배열 numbers를 선언

        // 3-2. 각 숫자의 합을 계산
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}
