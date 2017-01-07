package test;

import hackerrank.warmup.SimpleArraySum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by a7mad on 07/01/17.
 */
public class SimpleArrayTest {
    SimpleArraySum simpleArraySum;

    @Before
    public void setup() {
        simpleArraySum = new SimpleArraySum();
    }

    @Test
    public void testcase1() {
        int[] input = {1, 2, 3};
        int sum = simpleArraySum.solve(input);
        assertEquals(6, sum);
    }
}
