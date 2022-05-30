package org.tayg.caiyu;

/**
 * 74. 搜索二维矩阵
 * https://leetcode.cn/problems/search-a-2d-matrix/
 * 
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 
 * 
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 * 
 * 解题思路：
 * 将目标值 target 和每行的第一个值、最后一个值进行比较，是否再这个区间。
 * 是则遍历该行，搜索是否有与目标值 target 相同的值，有就返回true，没有返回 false；
 * 
 * 
 * 
 */

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix[0].length;

        for (int[] ins : matrix) {
            if (ins[0] <= target && ins[n - 1] >= target) {
                for (int i = 0; i < n; i++) {
                    if (ins[i] == target) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

}
