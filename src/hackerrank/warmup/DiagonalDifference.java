package hackerrank.warmup;

import java.util.Scanner;

// Problem on HackerRank: https://www.hackerrank.com/challenges/diagonal-difference

public class DiagonalDifference {

    public int solve(int[][] input) {
        int sum1 = 0;
        int length = input.length;
        for (int i = 0; i < length; i++) {
            sum1 += input[i][i];
        }

        int sum2 = 0;
        for (int i = 0, x = length - 1; i < length; i++, x--) {
            sum2 += input[i][x];
        }
        int sum = sum1 - sum2;
        return Math.abs(sum);
    }

    public int[][] getInput() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int input[][] = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int x = 0; x < length; x++) {
                input[i][x] = sc.nextInt();
            }
        }
        return input;
    }
}
