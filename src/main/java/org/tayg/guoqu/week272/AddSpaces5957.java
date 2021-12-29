package org.tayg.guoqu.week272;

public class AddSpaces5957 {

    public String addSpaces(String s, int[] spaces) {
        int p1 = 0;
        int p2 = 0;

        StringBuffer res = new StringBuffer();
        while (p1 < s.length() && p2 < spaces.length) {
            if (p1 < spaces[p2]) {
                res.append(s.charAt(p1));
                p1 += 1;
            } else if (p1 == spaces[p2]) {
                res.append(" ");
                p2 += 1;
            }
        }

        while (p1 < s.length()) {
            res.append(s.charAt(p1));
            p1 += 1;
        }

        return res.toString();
    }

}
