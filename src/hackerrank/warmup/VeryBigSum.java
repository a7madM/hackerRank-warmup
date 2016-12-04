package hackerrank.warmup;

import java.util.Scanner;

// Problem on HackerRank : https://www.hackerrank.com/challenges/a-very-big-sum

public class VeryBigSum {
    Scanner sc;

    public VeryBigSum() {
        sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
