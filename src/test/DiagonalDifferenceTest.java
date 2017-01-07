package test;

import hackerrank.warmup.DiagonalDifference;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a7mad on 07/01/17.
 */
public class DiagonalDifferenceTest {

    DiagonalDifference diagonalDifference;

    @Before
    public void setup() {
        diagonalDifference = new DiagonalDifference();
    }

    @Test
    public void testcase1() {
        int input[][] = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        int sum = diagonalDifference.solve(input);

        assertEquals(15, sum);
    }
}
