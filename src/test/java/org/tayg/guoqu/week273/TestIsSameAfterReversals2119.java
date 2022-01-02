package org.tayg.guoqu.week273;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestIsSameAfterReversals2119 {
    IsSameAfterReversals2119 solution = new IsSameAfterReversals2119();

    @Test
    public void testIsSameAfterReversals() {
        int num1 = 526;
        boolean trueRes1 = true;
        boolean res = solution.isSameAfterReversals(num1);
        assertEquals(res, trueRes1);
        int num2 = 1800;
        boolean trueRes2 = false;
        boolean res2 = solution.isSameAfterReversals(num2);
        assertEquals(res2, trueRes2);
        int num3 = 0;
        boolean trueRes3 = true;
        boolean res3 = solution.isSameAfterReversals(num3);
        assertEquals(res3, trueRes3);
    }
}
