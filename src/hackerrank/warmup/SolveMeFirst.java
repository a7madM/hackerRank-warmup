package hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by a7mad on 07/01/17.
 */

// problem https://www.hackerrank.com/challenges/solve-me-first
public class SolveMeFirst {

    public int solve(int a, int b) {
        return a + b;
    }

    public void takeInput() {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solve(a, b);
        System.out.println(sum);
    }
}
