

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            
            int count = 0;
            String ps = br.readLine();
            
            if (ps.startsWith(")"))
                System.out.println("NO");
            else {
                for (int j = 0; j < ps.length(); j++) {
                    if (String.valueOf(ps.charAt(j)).contains(")"))
                        count--;
                    else
                        count++;
                    if (count < 0) {
                        System.out.println("NO");
                        break;
                    }
                }

                if (count == 0)
                    System.out.println("YES");
                else if (count > 0)
                    System.out.println("NO");
            }
        }
    }
}