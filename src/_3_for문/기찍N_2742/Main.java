package _3_for문.기찍N_2742;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i=n; i>0; i--) {
            System.out.println(i);
        }
    }
}
