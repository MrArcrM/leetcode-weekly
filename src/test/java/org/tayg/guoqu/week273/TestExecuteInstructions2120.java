package org.tayg.guoqu.week273;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestExecuteInstructions2120 {
    ExecuteInstructions2120 solution = new ExecuteInstructions2120();

    @Test
    public void testExecuteInstructions() {
        int[] trueRes1 = { 1, 5, 4, 3, 1, 0 };
        int[] res1 = solution.executeInstructions(3, new int[] { 0, 1 }, "RRDDLU");
        assertArrayEquals(trueRes1, res1);
    }

}
