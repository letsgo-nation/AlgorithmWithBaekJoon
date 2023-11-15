import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String people = br.readLine();

        int maxPeople = 0;

        for(int i = 0; i < N; i++){

            if (people.charAt(i) == 'S') {
                maxPeople += 2;
            }  else {
                maxPeople += 1; }

        }

        System.out.println(Math.min( N, maxPeople/2+1));

    }

}