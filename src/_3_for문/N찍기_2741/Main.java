package _3_for문.N찍기_2741;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= n; i++) {
            bw.write(i + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
