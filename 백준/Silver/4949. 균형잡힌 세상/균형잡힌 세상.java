import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        while (true) {
            String str = br.readLine();
            
            if (str.equals(".")) break;
            int num = 1;
            char c[] = str.toCharArray();
            stack.clear();

            for (int j = 0; j < c.length; j++) {

                if (c[j] == '(' || c[j] == '[') stack.push(c[j]);
                else if (c[j] == ')') {
                    if (stack.isEmpty() ||  stack.pop() == '[') num = 0;
                }
                else if (c[j] == ']') {
                    if (stack.isEmpty() || stack.pop() == '(') num = 0;
                }
            }
            if (num == 1 && stack.isEmpty()) sb.append("yes\n");
            else sb.append("no\n");
        }
        System.out.println(sb);

    }
}
