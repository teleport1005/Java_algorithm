package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            sums.add(num1 + num2);

        for (Integer sum : sums) {
            System.out.println(num1 + num2);
        }

    }
}
