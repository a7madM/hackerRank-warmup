package hackerrank.warmup;

import java.util.Scanner;

// Problem On HackerRank: https://www.hackerrank.com/challenges/plus-minus
public class PlusMinus {

    public int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        return input;
    }

    public float[] solve(int[] input) {
        int positives = 0, negatives = 0, zeros = 0;
        int length = input.length;
        for (int i = 0; i < length; i++) {
            int number = input[i];
            if (number == 0) {
                zeros++;
            } else if (number > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        float posF = (float) positives / length;
        float negF = (float) negatives / length;
        float zerosF = (float) zeros / length;
        float[] output = {posF, negF, zerosF};
        return output;
    }
}
