package hackerrank.warmup;

import java.util.Scanner;

// Proble on HackerRank: https://www.hackerrank.com/challenges/staircase
public class StairCase {

    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int space = 5;
        for (int row = 0; row < size; row++) {
            for (int spaceCol = 0; spaceCol < space; spaceCol++) {
                System.out.print(" ");
            }
            for (int shapeCol = 0; shapeCol < (6 - space); shapeCol++) {
                System.out.print("#");
            }
            System.out.println("");
            space--;
        }
    }

}
