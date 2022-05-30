package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestGetFolderNames {

    @Test
    public void Test() {

        GetFolderNames g1 = new GetFolderNames();
        String[] names1 = { "onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece" };
        String[] trueResult1 = { "onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece(4)" };
        String[] res1 = g1.getFolderNames(names1);
        assertEquals(res1, trueResult1);
    }
}
