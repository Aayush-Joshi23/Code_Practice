class Solution {
    public int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }
        int i = 1;
        if (x <= 10) {
            for (i = 1; i <= x; i++) {
                if ((i * i) == x) {
                    return i;
                } else if ((i * i) > x) {
                    System.out.println(i);
                    return (i - 1);
                }
            }
        } else {
            long s = 0;
            for (i = 4; i <= x / 3; i++) {
                s = i;
                s = s * i;

                if (s == x) {
                    return i;
                }
                if (s > x)
                    return (i - 1);
            }
        }

        return i;

    }
}