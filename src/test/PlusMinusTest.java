package test;

import hackerrank.warmup.PlusMinus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by a7mad on 07/01/17.
 */
public class PlusMinusTest {

    PlusMinus plusMinus;

    @Before
    public void setup() {
        plusMinus = new PlusMinus();
    }

    @Test
    public void testcase1() {
        int[] input = {-4, 3, -9, 0, 4, 1};
        float[] output = plusMinus.solve(input);
        for (float out : output) {
            System.out.println(out);
        }
    }
}
