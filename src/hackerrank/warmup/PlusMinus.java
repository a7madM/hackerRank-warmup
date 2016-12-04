package hackerrank.warmup;

import java.util.Scanner;

// Problem On HackerRank: https://www.hackerrank.com/challenges/plus-minus
public class PlusMinus {

	public PlusMinus() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int positives = 0, negatives = 0, zeros = 0;
		int size = scanner.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < size; i++) {
			int number = arr[i];
			if (number == 0) {
				zeros++;
			} else if (number > 0) {
				positives++;
			} else {
				negatives++;
			}
		}
		float posF = (float) positives / size;
		float negF = (float) negatives / size;
		float zerosF = (float) zeros / size;
		System.out.println(posF + "\n" + negF + "\n" + zerosF);
	}
}
