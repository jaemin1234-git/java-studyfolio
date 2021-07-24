package condition.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BOJ9498 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println('A');
        }
    }
}
