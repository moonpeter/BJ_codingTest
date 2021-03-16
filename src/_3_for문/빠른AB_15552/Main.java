package _3_for문.빠른AB_15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(bf.readLine());

        for (int j=0; j<i; j++){
            String[] strs = bf.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            System.out.println(a+b);
        }
    }
}