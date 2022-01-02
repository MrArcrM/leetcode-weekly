package org.tayg.guogan;

/**
 * 解题思路：
 * 1. 从尾遍历字符串中的字符 a
 * 2. 从头遍历字符串中的字符 b
 * 3. 对比 字符a 与 字符b 的下标， 如果 字符a 的下标小于 字符b 返回true，否则返回false
 */

public class CheckString5967 {
    public boolean checkString(String s) {
        int n = s.length();
        int pa = 0;
        int pb = 0;

        // 1.从尾遍历字符串中的 字符a
        for (pa = n - 1; pa >= 0; pa--) {
            if (s.charAt(pa) == 'a') {
                break;
            }
        }

        // 2.从头遍历字符串中的 字符b
        for (pb = 0; pb < n; pb++) {
            if (s.charAt(pb) == 'b') {
                break;
            }
        }

        // 3. 比较 字符a 与 字符b 的下标
        return pa < pb;
    }
}
