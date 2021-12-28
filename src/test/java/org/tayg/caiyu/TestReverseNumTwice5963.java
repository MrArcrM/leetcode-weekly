package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestReverseNumTwice5963 {

    @Test
    public void TestReverseNumTwice() {

        ReverseNumTwice5963 solution = new ReverseNumTwice5963();
        int num = 526;
        boolean res = solution.isSameAfterReversals(num);
        Boolean trueResult = true;
        assertEquals(res, trueResult);

        ReverseNumTwice5963 solution1 = new ReverseNumTwice5963();
        int num1 = 1800;
        boolean res1 = solution1.isSameAfterReversals(num1);
        Boolean trueResult1 = false;
        assertEquals(res1, trueResult1);

        ReverseNumTwice5963 solution2 = new ReverseNumTwice5963();
        int num2 = 0;
        boolean res2 = solution2.isSameAfterReversals(num2);
        Boolean trueResult2 = true;
        assertEquals(res2, trueResult2);

    }
}
