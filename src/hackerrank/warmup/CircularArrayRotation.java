package hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by a7mad on 10/11/16.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/circular-array-rotation
public class CircularArrayRotation {

    int k, q, m;
    Scanner in;

    public int[] getInput() {
        in = new Scanner(System.in);
        int n = in.nextInt();
        k = in.nextInt();
        q = in.nextInt();

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = in.nextInt();
        }
        return input;
    }

    public CircularArrayRotation() {

        int[] input = getInput();
        int size = input.length;
        int[] output = solveProblem(input);
        for (int i = 0; i < q; i++) {
            int m = in.nextInt();
            System.out.println(output[size - m - 1]);
        }
    }

    public int[] solveProblem(int[] input) {
        int size = input.length;
        int[] output = new int[size];

        for (int i = 0; i < size; i++) {
            int position = size - (k + i) % size - 1;
            output[i] = input[position];
        }
        return output;
    }
}