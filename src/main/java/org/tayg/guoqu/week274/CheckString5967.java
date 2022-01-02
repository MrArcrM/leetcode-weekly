package org.tayg.guoqu.week274;

/**
 * solution for
 * https://leetcode-cn.com/problems/check-if-all-as-appears-before-all-bs/
 */
public class CheckString5967 {
    public boolean checkString(String s) {
        int n = s.length();
        int pa = n;
        int pb = -1;
        // 1. get last pa index
        for (pa = n; pa >= 0; pa--) {
            if (pa >= n) {
                continue;
            }
            if (s.charAt(pa) == 'a') {
                break;
            }
        }
        // 2. get first pb index
        for (pb = -1; pb < n; pb++) {
            if (pb < 0) {
                continue;
            }
            if (s.charAt(pb) == 'b') {
                break;
            }
        }

        return pa < pb;
    }
}