package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSearchMatrix {

    @Test
    public void Test() {

        SearchMatrix se = new SearchMatrix();
        int[][] matrix = { { 1 } };
        int target = 1;
        boolean trueResult = true;
        boolean res = se.searchMatrix(matrix, target);
        assertEquals(res, trueResult);

        SearchMatrix se1 = new SearchMatrix();
        int[][] matrix1 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target1 = 3;
        boolean trueResult1 = true;
        boolean res1 = se1.searchMatrix(matrix1, target1);
        assertEquals(res1, trueResult1);
        
    }
}
