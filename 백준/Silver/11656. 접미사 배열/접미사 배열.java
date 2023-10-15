import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int sLength = s.length();
        String[] strArray = new String[sLength];

        for (int i = 0; i < sLength; i++) {
            strArray[i] = s.substring(i, sLength);
        }

        Arrays.sort(strArray);

        for (String str : strArray) {
            System.out.println(str);
        }
    }
}
