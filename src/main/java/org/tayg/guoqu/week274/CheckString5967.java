package org.tayg.guoqu.week274;

/**
 * solution for
 * https://leetcode-cn.com/problems/check-if-all-as-appears-before-all-bs/
 */
public class CheckString5967 {
    public boolean checkString(String s) {
        int n = s.length();
        int pa = 0;
        int pb = 0;
        // 1. get last pa index
        for (pa = n - 1; pa >= 0; pa--) {
            if (s.charAt(pa) == 'a') {
                break;
            }
        }
        // 2. get first pb index
        for (pb = 0; pb < n; pb++) {
            if (s.charAt(pb) == 'b') {
                break;
            }
        }

        return pa < pb;
    }
}