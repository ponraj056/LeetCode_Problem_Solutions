class Solution {
    public boolean sumGame(String num) {
        int half = num.length() / 2;
        int q1 = 0, q2 = 0, s1 = 0, s2 = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c == '?') {
                if (i < half)
                    q1++;
                else
                    q2++;
            } else {
                if (i < half)
                    s1 += (c - '0');
                else
                    s2 += (c - '0');
            }
        }
        if ((q1 + q2) % 2 != 0)
            return true;
        return (2 * s1 + q1 * 9)/2 != (2 * s2 + q2 * 9)/2;
    }
}