import java.util.*;
class Solution {
    public int findClosest(int x, int y, int z) {
        int one_three = Math.abs(z-x);
        int two_three = Math.abs(z-y);
        if(one_three == two_three) return 0;
        return (one_three>two_three) ? 2 : 1;
    }
}