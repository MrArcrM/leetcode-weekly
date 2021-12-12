package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCountPoints59592 {

    CountPoints5952 solution = new CountPoints5952();

    @Test
    public void TestCountPoints(){
        String rings = "B0R0G0R9R0B0G0";
        int trueResult = 1;
        int res = solution.CountPoints(rings);
        assertEquals(res, trueResult);

        String rings1 = "B0B6G0R6R0R6G9";
        int trueResult1 = 1;
        int res1 = solution.CountPoints(rings1);
        assertEquals(res1, trueResult1);

        String rings2 = "G4";
        int trueResult2 = 0;
        int res2 = solution.CountPoints(rings2);
        assertEquals(res2, trueResult2);


    }

}
