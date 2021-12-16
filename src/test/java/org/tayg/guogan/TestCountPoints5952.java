package org.tayg.guogan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCountPoints5952 {
    CountPoints5952 solution = new CountPoints5952();

    @Test
    public void testCountPoints() {
        String rings1 = "B0B6G0R6R0R6G9";
        int trueResult = 1;
        int res1 = solution.countPoles(rings1);
        assertEquals(trueResult, res1);

        String rings2 = "B0R0G0R9R0B0G0";
        int trueResult2 = 1;
        int res2 = solution.countPoles(rings2);
        assertEquals(trueResult2, res2);

        String rings3 = "G4";
        int trueResult3 = 0;
        int res3 = solution.countPoles(rings3);
        assertEquals(trueResult3, res3);
    }
    
}
