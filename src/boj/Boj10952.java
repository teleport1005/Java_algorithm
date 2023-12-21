package boj;


import java.util.ArrayList;
import java.util.Scanner;

public class Boj10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }
            sums.add(num1 + num2);
        }
        for (int sum : sums) {
            System.out.println(sum);
        }
    }
}
