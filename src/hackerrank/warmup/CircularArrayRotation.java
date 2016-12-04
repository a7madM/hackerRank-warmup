package hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by a7mad on 10/11/16.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/circular-array-rotation
public class CircularArrayRotation {

    public CircularArrayRotation() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] output = solveProblem(a, n, k);
        System.out.println("-----------------");
        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt();

            System.out.println(output[n - m - 1]);
        }
    }

    public static int[] solveProblem(int[] input, int n, int k) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            int position = n - (k + i) % n - 1;
            output[i] = input[position];
        }
        return output;
    }
}
