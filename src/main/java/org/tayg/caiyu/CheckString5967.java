package org.tayg.caiyu;

/**
 * LeetCode 竞赛题-5967 检查字符串中所有的 'a' 字符是否在所有的 'b' 字符前。
 * https://leetcode-cn.com/problems/check-if-all-as-appears-before-all-bs/
 * 
 * 解题思路：
 * 查找最后一个 'a' 字符的索引，第一个 'b' 字符的索引，最后比较两个字符的索引。
 * 
 */
public class CheckString5967 {
    /**
     * 检查字符串中所有的 'a' 字符是否在所有的 'b' 字符前。
     * 
     * @param s 需要检查的字符串。
     * @return pa < pb 比较两个字符的索引。(若 pa < pb ，说明所有'a' 都在 'b' 之前)
     */
    public boolean checkString(String s) {

        int pa = 0;
        int pb = 0;
        for (pa = s.length() - 1; pa >= 0; pa--) {
            if (s.charAt(pa) == 'a') {
                break;
            }
        }

        for (pb = 0; pb < s.length(); pb++) {
            if (s.charAt(pb) == 'b') {
                break;
            }
        }

        return pa < pb;

    }

}
