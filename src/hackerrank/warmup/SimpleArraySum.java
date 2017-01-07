package hackerrank.warmup;

import java.util.Scanner;

// Problem on HackerRank: https://www.hackerrank.com/challenges/simple-array-sum

public class SimpleArraySum {


    public int solve(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }

        return sum;
    }

    public int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
