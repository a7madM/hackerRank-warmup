package hackerrank.warmup;

import java.util.Scanner;

public class LibraryFine {
	public LibraryFine() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String returnDate = sc.nextLine();
		String expectedDate = sc.nextLine();

		String[] returnArr = returnDate.split(" ");
		String[] expectedArr = expectedDate.split(" ");

		int returnD = Integer.parseInt(returnArr[0]);
		int expectedD = Integer.parseInt(expectedArr[0]);

		int returnM = Integer.parseInt(returnArr[1]);
		int expectedM = Integer.parseInt(expectedArr[1]);

		int returnY = Integer.parseInt(returnArr[2]);
		int expectedY = Integer.parseInt(expectedArr[2]);

		int fine = 0;

		if (returnDate.equals(expectedDate) || expectedY > returnY) {
			fine = 0;
			System.out.println(fine);
			return;
		}
		if (expectedY < returnY) {
			fine = 10000;
			System.out.println(fine);
			return;
		}
		if (expectedM == returnM) {
			int diffD = returnD - expectedD;
			if (diffD > 0)
				fine = 15 * diffD;
		} else if (expectedM < returnM) {
			int diffM = returnM - expectedM;
			fine = 500 * diffM;
		}
		System.out.println(fine);
	}
}
