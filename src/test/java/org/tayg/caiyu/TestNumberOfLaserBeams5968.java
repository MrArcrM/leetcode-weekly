package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNumberOfLaserBeams5968 {
    @Test
    public void TestNumberOfLaserBeams() {
        NumberOfLaserBeams5968 numberOfLaserBeams = new NumberOfLaserBeams5968();
        String[] bank = { "011001", "000000", "010100", "001000" };
        int res = numberOfLaserBeams.numberOfBeams(bank);
        int trueResult = 8;
        assertEquals(res, trueResult);

    }
}
