import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        for (int i=0; i<a; i++) {
            answer = String.valueOf(sb.append('*'));    
        }
        for (int i=0; i<b; i++) {
            System.out.println(answer);
        }
    }
}