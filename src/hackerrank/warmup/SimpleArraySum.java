package hackerrank.warmup;

import java.util.Scanner;

// Problem on HackerRank: https://www.hackerrank.com/challenges/simple-array-sum

public class SimpleArraySum {
	Scanner sc ;
	public SimpleArraySum() {
		sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}

		System.out.println(sum);
	}
}
