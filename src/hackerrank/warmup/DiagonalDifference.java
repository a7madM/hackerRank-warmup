package hackerrank.warmup;

import java.util.Scanner;

// Problem on HackerRank: https://www.hackerrank.com/challenges/diagonal-difference

public class DiagonalDifference {
	Scanner sc;

	public DiagonalDifference() {
		sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[][] = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int x = 0; x < size; x++) {
				arr[i][x] = sc.nextInt();
			}
		}
		int sum1 = 0;
		for (int i = 0; i < size; i++) {
			sum1 += arr[i][i];
		}

		int sum2 = 0;
		for (int i = 0, x = size - 1; i < size; i++, x--) {
			sum2 += arr[i][x];
		}
		int sum = sum1 - sum2;
		System.out.println(Math.abs(sum));
	}
}
