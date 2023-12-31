import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String document = br.readLine(); // 첫 번째 줄 문서
        String word = br.readLine() ;// 검색할 단어

        int count = findWordsWithoutOverlapping(document, word); // 단어가 반복된 수
        System.out.println(count);
    }

    // 단어가 반복된 수를 찾는 함수
    public static int findWordsWithoutOverlapping(String document, String word) {
        int count = 0; // 단어가 반복된 수 초기화
        int letterNumberOfWord = 0; // 단어의 자리 수
        while (letterNumberOfWord < document.length()) {
            int foundIndex = document.indexOf(word, letterNumberOfWord);
                // .indexOf((String str, int fromIndex)
                // .indexOf( "찾을 특정 문자" , "시작할 위치")
                // indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환
            if (foundIndex == -1) {
                // 만약 찾지 못했을 경우 "-1"을 반환한다.
                break;
            }
            count++;
            letterNumberOfWord = foundIndex + word.length();
        }
        return count;
    }
}
