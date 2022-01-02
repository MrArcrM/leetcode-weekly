package org.tayg.guoqu.week273;

/**
 * Solution for
 * https://leetcode-cn.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid/
 */
public class ExecuteInstructions2120 {
    /**
     * 
     * 
     * @param n        n * n 的网格
     * @param startPos 起始位置
     * @param s        指令
     * @return 从第 i 条指令开始执行, 一共可以执行多少条指令
     */
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int m = s.length();
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int x = startPos[0];
            int y = startPos[1];
            int steps = 0;
            for (int j = i; j < m; j++) {
                Character cmd = s.charAt(j);
                // update (x, y) with cmd
                int[] newPoint = update(x, y, cmd);
                x = newPoint[0];
                y = newPoint[1];
                // 重点: 为什么 steps = j - i
                if (isOutOfGrid(x, y, n)) {
                    steps = j - i;
                    break;
                }
                if (j == m - 1) {
                    steps = m - i;
                    break;
                }
            }
            ans[i] = steps;
        }

        return ans;
    }

    private int[] update(int x, int y, Character cmd) {
        if (cmd == 'L') {
            y--;
        } else if (cmd == 'R') {
            y++;
        } else if (cmd == 'U') {
            x--;
        } else if (cmd == 'D') {
            x++;
        }
        int[] newPoint = { x, y };

        return newPoint;
    }

    private boolean isOutOfGrid(int x, int y, int n) {
        return x < 0 || x >= n || y < 0 || y >= n;
    }

}
