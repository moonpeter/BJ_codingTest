package _3_for문.별찍기1_2438;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String star[] = new String[N];
        star[0] = "*";

        for(int j=1; j<N; j++) {
            star[j] = star[j-1] + "*";
        }

        for (int i=0; i<N; i++) {
            System.out.println(star[i]);
        }
    }
}
