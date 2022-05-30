package org.tayg.caiyu;

/**
 * 1759. 统计同构子字符串的数目
 * https://leetcode.cn/problems/count-number-of-homogenous-substrings/
 * 
 * 给你一个字符串 s ，返回 s 中 同构子字符串 的数目。由于答案可能很大，只需返回对 109 + 7 取余 后的结果。
 * 同构字符串 的定义为：如果一个字符串中的所有字符都相同，那么该字符串就是同构字符串。
 * 子字符串 是字符串中的一个连续字符序列。
 * 
 * 
 */

public class CountHomogenous {

    public int countHomogenous(String s) {

        int left = 0;
        int right = 0;
        int res = 0;
        while (right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                left = right;
            } else {
                res = (res + right - left + 1) % 1000000007;
                right++;
            }

        }

        return res;
    }

}
