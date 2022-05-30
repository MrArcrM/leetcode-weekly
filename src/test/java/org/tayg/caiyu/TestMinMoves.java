package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMinMoves {

    @Test
    public void Test() {
        MinMoves minMoves = new MinMoves();
        int target = 19;
        int maxDoubles = 2;
        int res = minMoves.minMoves(target, maxDoubles);
        int trueResult = 7;
        assertEquals(res, trueResult);

        MinMoves minMoves1 = new MinMoves();
        int target1 = 10;
        int maxDoubles1 = 4;
        int res1 = minMoves1.minMoves(target1, maxDoubles1);
        int trueResult1 = 4;
        assertEquals(res1, trueResult1);
    }

}
