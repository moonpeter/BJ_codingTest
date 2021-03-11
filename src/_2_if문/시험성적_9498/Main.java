package _2_if문.시험성적_9498;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int inputScore = sc.nextInt();

        if(inputScore <= 100 && inputScore >=90){
            System.out.println("A");
        } else if(inputScore <= 89 && inputScore >= 80) {
            System.out.println("B");
        } else if(inputScore <= 79 && inputScore >= 70) {
            System.out.println("C");
        } else if(inputScore <= 69 && inputScore >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
