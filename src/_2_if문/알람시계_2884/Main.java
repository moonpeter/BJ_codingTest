package _2_if문.알람시계_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

            if (minute - 45 < 0) {
                hour -= 1;
                if(hour < 0){
                    hour = 23;
                }
                minute = 60 - (45 - minute);
            } else {
                minute = minute - 45;
            }

        System.out.println(hour + " " + minute);
    }
}
